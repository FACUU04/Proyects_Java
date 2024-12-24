package com.fsmusic.modelos;

public class Audio {

    private String nombre;
    private int duracionMinutos;
    private int reproducciones;
    private int meGusta;
    private int clasificacion;

    //Metodo para sumar cada vez que es llamado
           public void meGusta(){
        this.meGusta++;
    }
           public void reproducciones(){
        this.reproducciones++;
    }

    //Getters y Setters
             public String getNombre() {
               return nombre;}
             public void setNombre(String nombre) {
               this.nombre = nombre;}
             public int getDuracionMinutos() {
               return duracionMinutos;}
             public void setDuracionMinutos(int duracionMinutos) {
               this.duracionMinutos = duracionMinutos;}
             public int getReproducciones() {
               return reproducciones;}
             public void setReproducciones(int reproducciones) {
               this.reproducciones = reproducciones;}
             public int getMeGusta() {
               return meGusta;}
             public void setMeGusta(int meGusta) {
               this.meGusta = meGusta;}
             public int getClasificacion() {
               return clasificacion;}
             public void setClasificacion(int clasificacion) {
               this.clasificacion = clasificacion;}


    public void detalles(){
        System.out.println("Estas escuchando "+nombre);
        System.out.println("Tiempo de reproduccion "+duracionMinutos + "minutos");
    }

}


