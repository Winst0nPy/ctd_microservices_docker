package com.digitalhouse.catalogservice.api.client;

import java.util.List;

import com.digitalhouse.catalogservice.config.FeignConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.digitalhouse.catalogservice.domain.model.MovieDTO;

@FeignClient(name = "movie-service")
@LoadBalancerClient(name="movie-service", configuration = FeignConfiguration.class)
public interface MovieClient {

    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieDTO>> findMovieByGenre(@PathVariable(value = "genre") String genre);

    @GetMapping("/movies/withErrors/{genre}")
    ResponseEntity<List<MovieDTO>> findMovieByGenreWithThrowError(@PathVariable(value = "genre") String genre,
                                                                 @RequestParam("throwError") boolean throwError);
}
