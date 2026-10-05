package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Review Load Balancer")
                                .description("Intelligent code review assignment engine. Balances PR review workload  fairly across the team while respecting expertise, availability, time  zones, and current review queue. Prevents the \"5 reviews for one person,  0 for another\" imbalance that burns out senior engineers and starves  juniors of learning opportunities. Tracks review SLAs and surfaces  bottlenecks before they delay releases. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Developer Productivity")
                                                .email("devex@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
