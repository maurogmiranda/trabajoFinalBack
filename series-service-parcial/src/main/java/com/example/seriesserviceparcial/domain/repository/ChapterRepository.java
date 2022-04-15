package com.example.seriesserviceparcial.domain.repository;

import com.example.seriesserviceparcial.domain.model.Chapter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends MongoRepository<Chapter,String> {
}
