package com.digitalhouse.catalogservice.api.client;

import com.digitalhouse.catalogservice.config.FeignConfiguration;
import com.digitalhouse.catalogservice.domain.model.SerieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "serie-service")
@LoadBalancerClient(name="serie-service", configuration = FeignConfiguration.class)
public interface SerieClient {

    @GetMapping("/series/{genre}")
    ResponseEntity<List<SerieDTO>> findSeriesByGenre(@PathVariable(value = "genre") String genre);

    @GetMapping("/series/withErrors/{genre}")
    ResponseEntity<List<SerieDTO>> findSeriesByGenreWithThrowError(@PathVariable(value = "genre") String genre,
                                                                 @RequestParam("throwError") boolean throwError);

}
