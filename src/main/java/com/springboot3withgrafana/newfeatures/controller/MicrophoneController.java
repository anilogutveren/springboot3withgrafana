package com.springboot3withgrafana.newfeatures.controller;

import com.springboot3withgrafana.newfeatures.dto.DrumMics;
import com.springboot3withgrafana.newfeatures.service.MicrophoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/microphone")
public class MicrophoneController {

    @Autowired
    private MicrophoneService microphoneService;

    @GetMapping("/all")
    public List<DrumMics> getAllMics() {
        return microphoneService.getAllDrumMics();
    }
}