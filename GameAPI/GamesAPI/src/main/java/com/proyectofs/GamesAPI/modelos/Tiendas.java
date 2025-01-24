package com.proyectofs.GamesAPI.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Tiendas(
        @JsonAlias("store") DetalleTienda store
        ) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record DetalleTienda(
            @JsonAlias("name") String name
    ){

    }
}

