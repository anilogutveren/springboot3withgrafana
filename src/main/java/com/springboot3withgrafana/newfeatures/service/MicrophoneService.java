package com.springboot3withgrafana.newfeatures.service;

import com.springboot3withgrafana.newfeatures.dto.DrumMics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MicrophoneService {

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

        return drumMicsList;
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

        return drumMicsList
                .stream()
                .filter(drumMics -> drumMics.id().equals(id))
                .findFirst().
                orElseThrow(() -> new RuntimeException("No mic found"));
    }
}
