package com.dh.series.controller;

import java.util.List;
import java.util.Objects;

import com.dh.series.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dh.series.service.SeriesService;

@RestController
@RequestMapping("/series")
public class SeriesController {

    private final SeriesService service;

    @Autowired
    public SeriesController(SeriesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Serie> serieList = service.findAll();
        return serieList.isEmpty()
            ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
            : ResponseEntity.ok(serieList);
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Serie>> findByGenre(@PathVariable String genre) {
        List<Serie> series = service.findByGenre(genre);
        return series.isEmpty()
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : ResponseEntity.ok(series);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Serie serie = service.findById(id);
        return Objects.isNull(serie)
            ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
            : ResponseEntity.ok(serie);
    }

    @PostMapping
    public ResponseEntity<?> saveSeries(@RequestBody Serie serie) {
        return ResponseEntity.ok(service.saveSeries(serie));
    }
}
