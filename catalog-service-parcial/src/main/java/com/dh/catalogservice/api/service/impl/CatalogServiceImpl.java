package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.api.service.MovieWSService;
import com.dh.catalogservice.domain.model.dto.CatalogWS;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import com.dh.catalogservice.domain.model.dto.SerieWS;
import com.dh.catalogservice.domain.repository.SerieRepository;
import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.ConnectException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	 private com.dh.catalogservice.domain.repository.MovieRepository movieRepository;

	@Autowired
	private SerieRepository serieRepository;
	


	@CircuitBreaker(name = "circuitGetCatalogByGenre", fallbackMethod = "fallBackGetCatalogByGenre")
	@Retry(name = "retryGetCatalogByGenre")
	public CatalogWS getCatalogByGenre(String genre){
		List<MovieWS> moviesWS = getMoviesByGenre(genre);
		List<SerieWS> seriesWS = getSeriesByGenre(genre);
		return new CatalogWS(genre,moviesWS,seriesWS);
	}


	public List<MovieWS> getMoviesByGenre(String genre){
		return movieRepository.getMovieByGenre(genre).getBody();
	}


	public List<SerieWS> getSeriesByGenre(String genre){
		return serieRepository.findSeriesByGenre(genre).getBody();
	}

	public CatalogWS fallBackGetCatalogByGenre(Exception e){
		return new CatalogWS("",Collections.EMPTY_LIST,Collections.EMPTY_LIST);
	}


}
