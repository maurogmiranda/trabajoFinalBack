package com.dh.catalogservice.domain.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class SeasonWS {

    private String id;
    private Integer seasonNumber;
    private List<ChapterWS> chapters;
}
