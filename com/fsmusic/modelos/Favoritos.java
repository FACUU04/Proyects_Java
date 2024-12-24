package com.fsmusic.modelos;

public class Favoritos {
    public void incluye(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getNombre()+" Lo mas popular del momento ");
        } else {
            System.out.println(audio.getNombre()+" Escuchar mas tarde ");
        }
    }
}
