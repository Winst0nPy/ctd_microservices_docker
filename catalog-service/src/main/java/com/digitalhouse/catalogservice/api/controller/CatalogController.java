package com.digitalhouse.catalogservice.api.controller;

import com.digitalhouse.catalogservice.api.service.CatalogService;
import com.digitalhouse.catalogservice.domain.model.CatalogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/{genre}")
    public ResponseEntity<CatalogDTO> getGenre(@PathVariable String genre) {
        CatalogDTO catalog = catalogService.findByGenre(genre);
        return new ResponseEntity<>(catalog, HttpStatus.OK);
    }


}
