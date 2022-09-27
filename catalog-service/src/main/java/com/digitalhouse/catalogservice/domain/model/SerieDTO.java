package com.digitalhouse.catalogservice.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SerieDTO {
    private Integer id;
    private String name;
    private String genre;
    private List<SeasonDTO> seasons;
}
