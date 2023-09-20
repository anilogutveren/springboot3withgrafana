package com.springboot3withgrafana.newfeatures.controller;

import com.springboot3withgrafana.newfeatures.dto.DrumMics;
import com.springboot3withgrafana.newfeatures.service.MicrophoneService;
import io.micrometer.observation.annotation.Observed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/microphone")
@Observed
public class MicrophoneController {

    @Autowired
    private MicrophoneService microphoneService;

    @GetMapping("/all")
    public List<DrumMics> getAllMics() {
        return microphoneService.getAllDrumMics();
    }

    @GetMapping("/{id}")
    public DrumMics getMicrophone(@PathVariable Integer id) {
        return microphoneService.getDrumMics(id);
    }
}
