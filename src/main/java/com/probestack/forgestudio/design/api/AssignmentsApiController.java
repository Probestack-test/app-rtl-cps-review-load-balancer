package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AssignReviewersRequest;
import com.probestack.forgestudio.design.model.Assignment;
import com.probestack.forgestudio.design.model.ReassignReviewerRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.AssignmentsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")
@Controller
@RequestMapping("${openapi.reviewLoadBalancer.base-path:/v1}")
public class AssignmentsApiController implements AssignmentsApi {

    private static final Logger log = LoggerFactory.getLogger(AssignmentsApiController.class);

    private final AssignmentsService assignmentsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public AssignmentsApiController(AssignmentsService assignmentsService, GeneratedRequestValidator generatedRequestValidator) {
        this.assignmentsService = assignmentsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Assignment> assignReviewers(@RequestBody() AssignReviewersRequest assignReviewersRequest) {
        log.info("Processing assignReviewers request");
        try {
            generatedRequestValidator.validate("assignReviewers", assignReviewersRequest);
            var response = assignmentsService.assignReviewers(assignReviewersRequest);
            log.info("assignReviewers completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process assignReviewers: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Assignment> getAssignment(@PathVariable() UUID assignmentId) {
        log.info("Processing getAssignment request");
        try {
            var response = assignmentsService.getAssignment(assignmentId);
            log.info("getAssignment completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getAssignment: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Assignment> reassignReviewer(@PathVariable() UUID assignmentId, @RequestBody() ReassignReviewerRequest reassignReviewerRequest) {
        log.info("Processing reassignReviewer request");
        try {
            generatedRequestValidator.validate("reassignReviewer", reassignReviewerRequest);
            var response = assignmentsService.reassignReviewer(assignmentId, reassignReviewerRequest);
            log.info("reassignReviewer completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process reassignReviewer: {}", e.getMessage(), e);
            throw e;
        }
    }
}
