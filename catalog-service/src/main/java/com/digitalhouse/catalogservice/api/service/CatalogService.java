package com.digitalhouse.catalogservice.api.service;

import com.digitalhouse.catalogservice.api.client.MovieClient;
import com.digitalhouse.catalogservice.api.client.SerieClient;
import com.digitalhouse.catalogservice.domain.model.CatalogDTO;
import com.digitalhouse.catalogservice.domain.model.MovieDTO;
import com.digitalhouse.catalogservice.domain.model.SerieDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    private final MovieClient movieClient;
    private final SerieClient serieClient;
    private final Logger LOG = LoggerFactory.getLogger(CatalogService.class);

    @Autowired
    public CatalogService(SerieClient serieClient, MovieClient movieClient) {
        this.movieClient = movieClient;
        this.serieClient = serieClient;
    }

    public CatalogDTO findByGenre(String genreName) {
        List<MovieDTO> movies = movieClient.findMovieByGenre(genreName).getBody();
        List<SerieDTO> series = serieClient.findSeriesByGenre(genreName).getBody();
        return CatalogDTO.builder()
                .genre(genreName)
                .movies(movies)
                .series(series)
                .build();
    }



}
