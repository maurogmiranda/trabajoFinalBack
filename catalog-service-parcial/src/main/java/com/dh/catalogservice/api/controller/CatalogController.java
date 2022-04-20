package com.dh.catalogservice.api.controller;

import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.domain.model.dto.CatalogWS;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import com.dh.catalogservice.domain.model.dto.SerieWS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/catalog")
public class CatalogController {
	@Autowired
	private CatalogService catalogService;

	@Autowired
	public CatalogController(CatalogService catalogService) {
		this.catalogService = catalogService;
	}

	@GetMapping("/{genre}")
	ResponseEntity<CatalogWS> getCatalogByGenre(@PathVariable String genre) {
		log.info("Se busco el catalogo con el genero {}",genre);
		return ResponseEntity.ok(catalogService.getCatalogByGenre(genre));
	}

	@PostMapping("/movie")
	private ResponseEntity<MovieWS> addMovie(@RequestBody MovieWS movieWS){
		return ResponseEntity.ok(catalogService.addMovie(movieWS));
	}

	@PostMapping("/serie")
	private ResponseEntity<SerieWS> addSerie(@RequestBody SerieWS serieWS){
		return ResponseEntity.ok(catalogService.addSerie(serieWS));
	}
}
