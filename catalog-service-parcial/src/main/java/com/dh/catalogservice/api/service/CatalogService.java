package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.dto.CatalogWS;
import com.dh.catalogservice.domain.model.dto.MovieWS;

public interface CatalogService {
    public CatalogWS getCatalogByGenre(String genre);
}
