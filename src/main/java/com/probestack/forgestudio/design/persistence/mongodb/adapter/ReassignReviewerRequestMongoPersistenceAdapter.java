package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ReassignReviewerRequestDomainRepository;
import com.probestack.forgestudio.design.model.ReassignReviewerRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.ReassignReviewerRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ReassignReviewerRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ReassignReviewerRequestMongoPersistenceAdapter implements ReassignReviewerRequestDomainRepository {
    private final ReassignReviewerRequestMongoRepository repository;

    public ReassignReviewerRequestMongoPersistenceAdapter(
            ReassignReviewerRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ReassignReviewerRequest save(ReassignReviewerRequest reassignReviewerRequest) {
        ReassignReviewerRequestDocument document = toDocument(reassignReviewerRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ReassignReviewerRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ReassignReviewerRequest> findAll() {
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

    private ReassignReviewerRequestDocument toDocument(
            ReassignReviewerRequest reassignReviewerRequest) {
        ReassignReviewerRequestDocument document = new ReassignReviewerRequestDocument();
        BeanUtils.copyProperties(reassignReviewerRequest, document);
        return document;
    }

    private ReassignReviewerRequest toDomain(ReassignReviewerRequestDocument document) {
        ReassignReviewerRequest domain = new ReassignReviewerRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
