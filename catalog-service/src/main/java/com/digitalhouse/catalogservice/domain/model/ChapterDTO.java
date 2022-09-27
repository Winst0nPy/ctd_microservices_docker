package com.digitalhouse.catalogservice.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChapterDTO {
    private String id;
    private String name;
    private Integer number;
    private String urlStream;
}
