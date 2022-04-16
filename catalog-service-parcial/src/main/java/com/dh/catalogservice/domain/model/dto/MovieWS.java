package com.dh.catalogservice.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "moviesWS")
public class MovieWS {
    @Id
    private Integer id;
    private String name;
    private String genre;
    private String urlStream;
}
