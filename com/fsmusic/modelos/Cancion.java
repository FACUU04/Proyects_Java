package com.fsmusic.modelos;

public class Cancion extends Audio {

    private String artista;
    private String album;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getMeGusta() >500000){
            System.out.println("Grandes exitos!");
        } else if (getMeGusta() <= 500000){
            System.out.println("Lo mas escuchado");
        }
        return 0;
    }


    //Getters y Setters
         public String getArtista() {
          return artista;}
         public void setArtista(String artista) {
          this.artista = artista;}
         public String getGenero() {
          return genero;}
         public void setGenero(String genero) {
          this.genero = genero;}
         public String getAlbum() {
          return album;}
         public void setAlbum(String album) {
          this.album = album;}
}
