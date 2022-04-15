package com.example.seriesserviceparcial.domain.repository;

import com.example.seriesserviceparcial.domain.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends MongoRepository<Season,String> {
}
