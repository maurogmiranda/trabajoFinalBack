package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.domain.model.dto.CatalogWS;
import com.dh.catalogservice.domain.model.dto.MovieWS;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 public class CatalogServiceImplTest {

   @Autowired
   private CatalogServiceImpl catalogService;

 @Test
 public void traerpeliculasPorGenero(){
  CatalogWS catalogWS = catalogService.getCatalogByGenre("Terror");
  Assert.assertTrue(catalogWS.getMovies().size()==3);

 }

}