package com.proyectofs.GamesAPI.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
