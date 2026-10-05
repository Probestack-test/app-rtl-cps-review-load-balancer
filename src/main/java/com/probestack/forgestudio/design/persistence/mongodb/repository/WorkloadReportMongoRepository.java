package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.WorkloadReportDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for WorkloadReport documents.
 */
public interface WorkloadReportMongoRepository extends MongoRepository<WorkloadReportDocument, String> {
}
