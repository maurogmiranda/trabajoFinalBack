package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.dto.CatalogWS;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import com.dh.catalogservice.domain.model.dto.SerieWS;

public interface CatalogService {
    public CatalogWS getCatalogByGenre(String genre);
    public MovieWS addMovie(MovieWS movieWS);
    public SerieWS addSerie(SerieWS serieWS);
}
