package com.dh.catalogservice.domain.repository;

import com.dh.catalogservice.domain.model.dto.SerieWS;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieWSRepository extends MongoRepository<SerieWS,String> {
}
