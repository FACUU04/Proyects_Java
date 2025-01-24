package com.proyectofs.GamesAPI.principal;

import com.proyectofs.GamesAPI.modelos.Datos;
import com.proyectofs.GamesAPI.modelos.DatosJuegos;
import com.proyectofs.GamesAPI.modelos.Plataformas;
import com.proyectofs.GamesAPI.modelos.Tiendas;
import com.proyectofs.GamesAPI.service.ConsumoAPI;
import com.proyectofs.GamesAPI.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private static final String URL_BASE = "https://api.rawg.io/api/games?search=";
    private static final String URL_2 = "https://api.rawg.io/api/games?";
    private static final String API_KEY = "&key=fce31d8fc807414a9f80ea0ee0c11b94";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar top 10 juegos con mejor valoración");
            System.out.println("2. Buscar un videojuego por nombre");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción (1-3): ");
            while (!teclado.hasNextInt()) {
                System.out.println("Opción no válida. Por favor, ingresa un número entre 1 y 3.");
                System.out.print("Selecciona una opción (1-3): ");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    TopJuegos();
                    break;
                case 2:
                    buscarPorNombre();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
            }

        } while (opcion != 3);

    }

    //Top10
    private void TopJuegos(){
        var json = ConsumoAPI.obtenerDatos(URL_2 + API_KEY);
        var datos = conversor.obtenerDatos(json, Datos.class);

        System.out.println("TOP 10 Videojuegos mejor valorados");
        datos.VideoGames().stream()
                .sorted(Comparator.comparing(DatosJuegos::clasificacion).reversed())
                .limit(10)
                .forEach(juego -> {
                    System.out.println("Título: " + juego.titulo());
                    System.out.println("Clasificación: " + juego.clasificacion());
                    System.out.println("Total de Evaluaciones: " + juego.totalevaluaciones());
                    System.out.println("-------------------------------------------------");
                });


    }

    //Busqueda Personalizada por usuario
    private void buscarPorNombre() {

        System.out.println("Buscar por nombre");
        var nombre = teclado.nextLine();
        var json = ConsumoAPI.obtenerDatos(URL_BASE + nombre.replace(" ", "%20") + API_KEY);
        //System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);



        // Filtrar los juegos que contengan exactamente el nombre buscado
        for (DatosJuegos juego : datos.VideoGames()) {
            if (juego.titulo().toLowerCase().contains(nombre.toLowerCase())) { // Comparar sin distinguir mayúsculas y minúsculas
                System.out.println("Título: " + juego.titulo());
                System.out.println("Fecha de Lanzamiento: " + juego.fechaLanzamiento());
                System.out.println("Clasificación: " + juego.clasificacion());
                System.out.println("Total de Evaluaciones: " + juego.totalevaluaciones());
                System.out.println("Última Actualización: " + juego.UltimaUpdate());

                // Mostrar plataformas
                // Validar que la lista de plataformas no este vacía
                if (juego.platforms() != null && !juego.platforms().isEmpty()) {
                    System.out.println("Plataformas:");

                    for (Plataformas platform : juego.platforms()) {
                        if (platform != null && platform.platform() != null && platform.platform().name() != null) {
                            System.out.println("  - " + platform.platform().name());
                        }
                    }
                } else {
                    System.out.println("No hay plataformas disponibles.");
                }


                // Validar que la lista de tiendas no esta vacia
                if (juego.stores() != null && !juego.stores().isEmpty()) {
                    System.out.println("Tiendas:");
                    //Mostrar las tiendas
                    for (Tiendas store : juego.stores()) {
                        if (store != null && store.store() != null && store.store().name() != null) {
                            System.out.println("  - " + store.store().name());
                        }
                    }
                } else {
                    System.out.println("No hay tiendas disponibles.");
                }


                System.out.println("------------------------------------------------");
            }
        }

        }


    }









