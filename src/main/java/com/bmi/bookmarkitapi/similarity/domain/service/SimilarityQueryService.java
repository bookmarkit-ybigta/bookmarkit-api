package com.bmi.bookmarkitapi.similarity.domain.service;

import com.bmi.bookmarkitapi.common.BaseQueryService;
import com.bmi.bookmarkitapi.similarity.domain.exception.SimilarityNotFoundException;
import com.bmi.bookmarkitapi.similarity.domain.model.Similarity;
import com.bmi.bookmarkitapi.similarity.domain.repository.SimilarityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SimilarityQueryService extends BaseQueryService<Similarity> {

    private final SimilarityRepository similarityRepository;

    public SimilarityQueryService(SimilarityRepository repository) {
        super(repository, new SimilarityNotFoundException());
        similarityRepository = repository;
    }

    public Optional<Similarity> query(String inputLink) {
        return similarityRepository.findByInputLink(inputLink);
    }
}
