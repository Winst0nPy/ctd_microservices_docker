package com.dh.series.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Chapter")
@Data
public class Chapter {

    @Id
    private String id;
    private String name;
    private Integer number;
    private String urlStream;



}
