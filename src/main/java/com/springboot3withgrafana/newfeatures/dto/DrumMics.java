package com.springboot3withgrafana.newfeatures.dto;

public record DrumMics(
        Integer id,
        String kick,
        String snare,
        String hihat,
        String tom1,
        String tom2,
        String tom3,
        String overhead1,
        String overhead2
) {
}
