package com.proyectofs.GamesAPI.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Plataformas(
        @JsonAlias("platform") SubPlataforma platform
) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record SubPlataforma(
            @JsonAlias("name") String name
    ) {
    }
}
