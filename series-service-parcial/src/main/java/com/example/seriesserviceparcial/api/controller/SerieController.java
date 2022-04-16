package com.example.seriesserviceparcial.api.controller;

import com.example.seriesserviceparcial.api.service.SerieService;
import com.example.seriesserviceparcial.domain.model.Serie;
import com.example.seriesserviceparcial.queue.SerieSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService serieService;
    @Autowired
    private SerieSender serieSender;

    @GetMapping("/{genre}")
    private ResponseEntity<List<Serie>> findSeriesByGenre(@PathVariable String genre){
        log.info("Se buscaron las series con genero {}",genre);
        return ResponseEntity.ok(serieService.findSeriesByGenre(genre));
    }

    @PostMapping()
    private ResponseEntity<Serie> addSerie(@RequestBody Serie serie){
        log.info("Se posteo las series con titulo {} y genero",serie.getName(),serie.getGenre());

        return ResponseEntity.ok(serieSender.send(serie));
    }
}
