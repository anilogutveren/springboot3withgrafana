package com.springboot3withgrafana.newfeatures.service;

import com.springboot3withgrafana.newfeatures.dto.DrumMics;
import io.micrometer.observation.Observation;

import io.micrometer.observation.ObservationRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MicrophoneService {

    @Autowired
    private ObservationRegistry observationRegistry;

    List<DrumMics> drumMicsList = new ArrayList<>();

    public List<DrumMics> getAllDrumMics() {
        drumMicsList.add(new DrumMics(1, "AKG D112",
                "Shure SM57",
                "Shure SM81",
                "Shure SM98",
                "Shure SM98",
                "Shure SM98",
                "Shure SM81",
                "Shure SM81"));

        log.info("Fetching all drum mics");
        return Observation.createNotStarted("getAllDrumMics", observationRegistry)
                .observe(() -> drumMicsList);
    }

    public DrumMics getDrumMics(Integer id) {
        drumMicsList.add(new DrumMics(1, "AKG D112",
                "Shure SM57",
                "Shure SM81",
                "Shure SM98",
                "Shure SM98",
                "Shure SM98",
                "Shure SM81",
                "Shure SM81"));

        log.info("Fetching drum mics by id");
        return Observation.createNotStarted("getDrumMics", observationRegistry)
                .observe(() -> drumMicsList
                        .stream()
                        .filter(drumMics -> drumMics.id().equals(id))
                        .findFirst().
                        orElseThrow(() -> new RuntimeException("No mic found")));
    }
}

