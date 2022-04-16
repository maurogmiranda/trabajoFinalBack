package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.MovieWSService;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import com.dh.catalogservice.domain.repository.MovieRepository;
import com.dh.catalogservice.domain.repository.MovieWSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieWSServiceImpl implements MovieWSService {
    @Autowired
    private MovieWSRepository movieWSRepository;

    @Override
    public MovieWS saveMovieWS(MovieWS movieWS) {
        return movieWSRepository.save(movieWS);
    }

    @Override
    public List<MovieWS> findMoviesByGenre(String genre) {
        return movieWSRepository.findAllByGenre(genre);
    }
}
