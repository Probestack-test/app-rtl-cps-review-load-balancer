package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.WorkloadReportDomainRepository;
import com.probestack.forgestudio.design.model.WorkloadReport;
import com.probestack.forgestudio.design.persistence.mongodb.document.WorkloadReportDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.WorkloadReportMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class WorkloadReportMongoPersistenceAdapter implements WorkloadReportDomainRepository {
    private final WorkloadReportMongoRepository repository;

    public WorkloadReportMongoPersistenceAdapter(WorkloadReportMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkloadReport save(WorkloadReport workloadReport) {
        WorkloadReportDocument document = toDocument(workloadReport);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<WorkloadReport> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<WorkloadReport> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private WorkloadReportDocument toDocument(WorkloadReport workloadReport) {
        WorkloadReportDocument document = new WorkloadReportDocument();
        BeanUtils.copyProperties(workloadReport, document);
        return document;
    }

    private WorkloadReport toDomain(WorkloadReportDocument document) {
        WorkloadReport domain = new WorkloadReport();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
