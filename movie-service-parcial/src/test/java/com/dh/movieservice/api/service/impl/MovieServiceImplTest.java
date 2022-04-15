package com.dh.movieservice.api.service.impl;

import com.dh.movieservice.domain.model.Movie;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovieServiceImplTest {
    @Autowired
    private MovieServiceImpl movieService;


    @Test
    public void crearPelicula(){
        Movie movie = new Movie();
        movie.setGenre("drama");
        movie.setName("500 dias con ella");
        movie.setUrlStream("no se gg");
        movieService.save(movie);
        Assert.assertTrue(movie.getId()!=null);

    }

}