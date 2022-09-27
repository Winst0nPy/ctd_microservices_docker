package com.dh.series.repository;

import com.dh.series.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeriesRepository extends MongoRepository<Serie, String> {
    List<Serie> findByGenre(String genre);
}
