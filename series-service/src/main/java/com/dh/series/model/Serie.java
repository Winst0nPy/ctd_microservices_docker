package com.dh.series.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Serie")
@Data
public class Serie {

    @Id
    private Integer id;
    private String name;
    private String genre;
    private List<Season> seasons;

    @Override
    public String toString() {
        return "{\"Serie\":{"
            + "\"id\":\"" + id + "\""
            + ", \"name\":\"" + name + "\""
            + ", \"genre\":\"" + genre + "\""
            + "}}";
    }
}
