package com.dh.series.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Seasons {

    @Id
    private String id;
    private Integer seasonNumber;
    private List<Chapter> chapters;




}
