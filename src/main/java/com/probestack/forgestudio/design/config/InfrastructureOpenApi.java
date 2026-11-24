package com.probestack.forgestudio.design.config;

import java.util.List;

import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.parameters.RequestBody;

/** Documents framework-provided endpoints that SpringDoc cannot discover as MVC controllers. */
final class InfrastructureOpenApi {

    private static final String JSON = "application/json";

    private InfrastructureOpenApi() {
    }

    static Paths paths() {
        return new Paths()
                .addPathItem("/actuator/health", monitoringGet("Health", "Health"))
                .addPathItem("/actuator/health/liveness", monitoringGet("Liveness", "Liveness"))
                .addPathItem("/actuator/health/readiness", monitoringGet("Readiness", "Readiness"))
                .addPathItem("/actuator/metrics", monitoringGet("Metrics", "Metrics"))
                .addPathItem("/actuator/prometheus", prometheusGet())
                .addPathItem("/oauth2/token", tokenPost());
    }

    private static PathItem monitoringGet(String summary, String operationName) {
        Operation operation = new Operation()
                .tags(List.of("Health"))
                .summary(summary)
                .operationId("get" + operationName)
                .responses(jsonResponse("200", "Monitoring data returned successfully"));
        return new PathItem().get(operation);
    }

    private static PathItem prometheusGet() {
        ApiResponses responses = new ApiResponses().addApiResponse("200", new ApiResponse()
                .description("Prometheus metrics returned successfully")
                .content(new Content().addMediaType("text/plain", new MediaType()
                        .schema(new StringSchema()))));
        Operation operation = new Operation()
                .tags(List.of("Health"))
                .summary("Prometheus")
                .operationId("getPrometheusMetrics")
                .responses(responses);
        return new PathItem().get(operation);
    }

    private static PathItem tokenPost() {
        ObjectSchema requestSchema = new ObjectSchema();
        requestSchema.addProperty("grant_type", new StringSchema()
                .description("OAuth 2.0 grant type")
                ._default("client_credentials")
                ._enum(List.of("client_credentials")));
        requestSchema.addProperty("scope", new StringSchema()
                .description("Space-delimited scopes")
                .example("api.read api.write"));
        requestSchema.setRequired(List.of("grant_type"));

        ObjectSchema responseSchema = new ObjectSchema();
        responseSchema.addProperty("access_token", new StringSchema());
        responseSchema.addProperty("token_type", new StringSchema().example("Bearer"));
        responseSchema.addProperty("expires_in", new IntegerSchema().example(3600));
        responseSchema.addProperty("scope", new StringSchema().example("api.read api.write"));

        Operation operation = new Operation()
                .tags(List.of("Security"))
                .summary("Get OAuth2 Token")
                .description("Uses the OAuth 2.0 client credentials grant. Authenticate the client "
                        + "with HTTP Basic credentials and submit grant_type=client_credentials.")
                .operationId("getOAuth2Token")
                .requestBody(new RequestBody()
                        .required(true)
                        .content(new Content().addMediaType("application/x-www-form-urlencoded",
                                new MediaType().schema(requestSchema))))
                .responses(new ApiResponses()
                        .addApiResponse("200", new ApiResponse()
                                .description("Access token issued successfully")
                                .content(new Content().addMediaType(JSON,
                                        new MediaType().schema(responseSchema))))
                        .addApiResponse("400", new ApiResponse().description("Invalid token request"))
                        .addApiResponse("401", new ApiResponse().description("Invalid client credentials")));
        return new PathItem().post(operation);
    }

    private static ApiResponses jsonResponse(String status, String description) {
        return new ApiResponses().addApiResponse(status, new ApiResponse()
                .description(description)
                .content(new Content().addMediaType(JSON, new MediaType()
                        .schema(new ObjectSchema()))));
    }
}
