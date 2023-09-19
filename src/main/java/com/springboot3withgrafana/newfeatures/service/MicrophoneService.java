package com.springboot3withgrafana.newfeatures.service;

import com.springboot3withgrafana.newfeatures.dto.DrumMics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MicrophoneService {

    List<DrumMics> drumMicsList = new ArrayList<>();

    public List<DrumMics> getAllDrumMics() {
        drumMicsList.add(new DrumMics("AKG D112",
                "Shure SM57",
                "Shure SM81",
                "Shure SM98",
                "Shure SM98",
                "Shure SM98",
                "Shure SM81",
                "Shure SM81"));

        return drumMicsList;
    }
}
