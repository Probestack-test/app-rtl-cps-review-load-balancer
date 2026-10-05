package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.WorkloadReport;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for WorkloadReport domain operations.
 */
public interface WorkloadReportDomainRepository {
    WorkloadReport save(WorkloadReport workloadReport);

    Optional<WorkloadReport> findById(String id);

    List<WorkloadReport> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
