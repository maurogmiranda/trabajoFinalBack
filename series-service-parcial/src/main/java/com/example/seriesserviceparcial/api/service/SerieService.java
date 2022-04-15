package com.example.seriesserviceparcial.api.service;

import com.example.seriesserviceparcial.domain.model.Serie;

import java.util.List;

public interface SerieService {
    public Serie addSeries(Serie series);
    public List<Serie> findSeriesByGenre(String genre);
}
