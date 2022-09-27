package com.dh.series.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Season")
@Data
public class Season {

    @Id
    private Integer id;
    private Integer seasonNumber;
    private String genre;
    private List<Chapter> chapters;



}
