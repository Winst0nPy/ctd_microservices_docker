package com.dh.series.service;

import java.util.List;

import com.dh.series.model.Serie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.series.repository.SeriesRepository;

@Service
public class SeriesService {

    private final SeriesRepository seriesRepository;
    private static final Logger LOG = LoggerFactory.getLogger(SeriesService.class);

    @Autowired
    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<Serie> findByGenre(String genre) {
        return seriesRepository.findByGenre(genre);
    }

    public Serie findById(String id) {
        return seriesRepository.findById(id)
            .orElse(null);
    }

    public List<Serie> findAll() {
        return seriesRepository.findAll();
    }

    @RabbitListener(queues = "${queue.series.name}")
    public Serie saveSeries(Serie serie) {
        LOG.info("Se recibió una nueva serie a través de rabbit " + serie.toString());
        return seriesRepository.save(serie);
    }
}
