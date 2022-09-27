package com.digitalhouse.catalogservice.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CatalogDTO {
    private String genre;
    private List<MovieDTO> movies;
    private List<SerieDTO> series;
}
