package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.dto.MovieWS;

import java.util.List;

public interface MovieWSService {
    public MovieWS saveMovieWS(MovieWS movieWS);
    public List<MovieWS> findMoviesByGenre(String genre);
}
