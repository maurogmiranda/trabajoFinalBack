package com.example.seriesserviceparcial.domain.repository;

import com.example.seriesserviceparcial.domain.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie, String> {
    public List<Serie> findSeriesByGenre(String genre);
}
