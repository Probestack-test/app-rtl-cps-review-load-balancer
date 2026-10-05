package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ReassignReviewerRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ReassignReviewerRequest domain operations.
 */
public interface ReassignReviewerRequestDomainRepository {
    ReassignReviewerRequest save(ReassignReviewerRequest reassignReviewerRequest);

    Optional<ReassignReviewerRequest> findById(String id);

    List<ReassignReviewerRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
