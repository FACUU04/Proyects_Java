package com.fsmusic.principal;
import com.fsmusic.modelos.Cancion;
import com.fsmusic.modelos.Favoritos;
import com.fsmusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        //Estableciendo datos
        Cancion miCancion = new Cancion();
          miCancion.setArtista("Morat");
          miCancion.setNombre("Tarde");
          miCancion.setAlbum("Antes de que amanezca");
          miCancion.setGenero("pop rock");
          miCancion.setDuracionMinutos(2);

          Cancion otraCancion = new Cancion();
          otraCancion.setArtista("Luck Ra");
          otraCancion.setNombre("Ya no vuelvas");
          otraCancion.setAlbum("QUE NOS FALTE TODO");
          otraCancion.setGenero("balada");
          otraCancion.setDuracionMinutos(3);

        Podcast miPodcast = new Podcast();
          miPodcast.setNombre("The Wild Proyect");
          miPodcast.setNumeroPodcast(95);
          miPodcast.setTematica("Tecnologia");
          miPodcast.setNombrePrograma("Hackers peligrosos, Bill Gates tramposo," +
                " China y microchips");


          //Estableciendo cantidad reproducciones y likes
        for (int i = 0; i < 16000000; i++) {
            miCancion.reproducciones();}
        for (int i = 0; i < 180000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 4400000; i++) {
            miPodcast.reproducciones();}
        for (int i = 0; i < 55000; i++) {
            miPodcast.meGusta();

        }
        System.out.println("Nombre "+miCancion.getNombre());
        System.out.println("Vistas: "+miCancion.getReproducciones());
        System.out.println("Me gusta: "+miCancion.getMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.incluye(miCancion);
        favoritos.incluye(otraCancion);
        favoritos.incluye(miPodcast);


            System.out.println("Estas escuchando "+otraCancion.getNombre());
            System.out.println("Tiempo de reproduccion "+otraCancion.getDuracionMinutos() + "minutos");
        




    }
}
