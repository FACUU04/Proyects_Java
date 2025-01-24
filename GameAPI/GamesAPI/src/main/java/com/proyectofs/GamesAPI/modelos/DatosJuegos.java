package com.proyectofs.GamesAPI.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.awt.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosJuegos(

        @JsonAlias("name") String titulo,
        @JsonAlias("released") String fechaLanzamiento,
        @JsonAlias("rating") Double clasificacion,
        @JsonAlias("ratings_count") Integer totalevaluaciones,
        @JsonAlias("updated") String UltimaUpdate,
        @JsonAlias("platforms") List<Plataformas> platforms,
        @JsonAlias("stores") List<Tiendas> stores

) {
}
