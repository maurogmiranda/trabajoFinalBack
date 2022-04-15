package com.dh.catalogservice.domain.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class SerieWS {

    private String id;
    private String name;
    private String genre;
    private List<SeasonWS> seasons;
}
