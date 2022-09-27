package com.digitalhouse.catalogservice.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SeasonDTO {
    private Integer id;
    private Integer seasonNumber;
    private String genre;
    private List<ChapterDTO> chapters;
}
