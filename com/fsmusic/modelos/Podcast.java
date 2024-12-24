package com.fsmusic.modelos;

public class Podcast extends Audio{

    private String nombrePrograma;
    private int numeroPodcast;
    private String tematica;

    @Override
    public int getClasificacion() {
        if (getReproducciones() >= 100000){
return 9;
        }else {
            return 2;
        }
    }

    //Getters y Setters
    public String getNombrePrograma() {
        return nombrePrograma;}
    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;}
    public int getNumeroPodcast() {
        return numeroPodcast;}
    public void setNumeroPodcast(int numeroPodcast) {
        this.numeroPodcast = numeroPodcast;}
    public String getTematica() {
        return tematica;}
    public void setTematica(String tematica) {
        this.tematica = tematica;}


}
