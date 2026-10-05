package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ReassignReviewerRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ReassignReviewerRequest documents.
 */
public interface ReassignReviewerRequestMongoRepository extends MongoRepository<ReassignReviewerRequestDocument, String> {
}
