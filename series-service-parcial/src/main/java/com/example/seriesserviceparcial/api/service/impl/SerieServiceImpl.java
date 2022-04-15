package com.example.seriesserviceparcial.api.service.impl;

import com.example.seriesserviceparcial.api.service.SerieService;
import com.example.seriesserviceparcial.domain.model.Serie;
import com.example.seriesserviceparcial.domain.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public Serie addSeries(Serie series) {
        return serieRepository.save(series);
    }

    @Override
    public List<Serie> findSeriesByGenre(String genre) {
        return serieRepository.findSeriesByGenre(genre);
    }
}
