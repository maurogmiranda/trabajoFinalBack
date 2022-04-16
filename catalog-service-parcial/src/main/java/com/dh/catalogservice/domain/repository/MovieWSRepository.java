package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.dto.MovieWS;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieWSRepository extends MongoRepository<MovieWS,Integer> {
    public List<MovieWS> findAllByGenre(String genre);
}
