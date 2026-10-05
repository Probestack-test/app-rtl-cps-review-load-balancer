package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.WorkloadReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.WorkloadService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")
@Controller
@RequestMapping("${openapi.reviewLoadBalancer.base-path:/v1}")
public class WorkloadApiController implements WorkloadApi {

    private static final Logger log = LoggerFactory.getLogger(WorkloadApiController.class);

    private final WorkloadService workloadService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public WorkloadApiController(WorkloadService workloadService, GeneratedRequestValidator generatedRequestValidator) {
        this.workloadService = workloadService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<WorkloadReport> getTeamWorkload(@RequestParam(value = "teamName", required = true) String teamName, @RequestParam(value = "repoId", required = false) String repoId, @RequestParam(value = "windowDays", required = false, defaultValue = "30") Integer windowDays, @RequestParam(value = "sortBy", required = false, defaultValue = "PENDING_REVIEWS") String sortBy) {
        log.info("Processing getTeamWorkload request");
        try {
            var response = workloadService.getTeamWorkload(teamName, repoId, windowDays, sortBy);
            log.info("getTeamWorkload completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getTeamWorkload: {}", e.getMessage(), e);
            throw e;
        }
    }
}
