package com.dh.catalogservice.api.service.impl;

import com.dh.catalogservice.api.service.SerieWSService;
import com.dh.catalogservice.domain.model.dto.SerieWS;
import com.dh.catalogservice.domain.repository.SerieRepository;
import com.dh.catalogservice.domain.repository.SerieWSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieWSServiceImpl implements SerieWSService {
    @Autowired
    private SerieWSRepository serieRepository;

    @Override
    public SerieWS addSerieWS(SerieWS serieWS) {
        return serieRepository.save(serieWS);
    }
}
