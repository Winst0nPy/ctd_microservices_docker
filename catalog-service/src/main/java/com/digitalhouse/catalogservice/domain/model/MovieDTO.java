package com.digitalhouse.catalogservice.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDTO {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
