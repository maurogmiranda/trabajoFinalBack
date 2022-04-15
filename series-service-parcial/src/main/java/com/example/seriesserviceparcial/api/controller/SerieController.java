package com.example.seriesserviceparcial.api.controller;

import com.example.seriesserviceparcial.api.service.SerieService;
import com.example.seriesserviceparcial.domain.model.Serie;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping("/{genre}")
    private ResponseEntity<List<Serie>> findSeriesByGenre(@PathVariable String genre){
        return ResponseEntity.ok(serieService.findSeriesByGenre(genre));
    }

    @PostMapping()
    private ResponseEntity<Serie> addSerie(@RequestBody Serie serie){
        return ResponseEntity.ok(serieService.addSeries(serie));
    }
}
