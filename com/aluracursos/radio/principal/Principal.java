package com.aluracursos.radio.principal;
import com.aluracursos.radio.modelos.Canciones;
import com.aluracursos.radio.modelos.MisFavoritos;
import com.aluracursos.radio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Canciones miCancion = new Canciones();
        miCancion.setTitulo("Vivo");
        miCancion.setCantante("GC");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Diego");
        miPodcast.setTitulo("Tech");
        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de MeGusta "+miCancion.getTotalDeMeGusta());

        MisFavoritos misFavoritos= new MisFavoritos();
        misFavoritos.adicione(miPodcast);
        misFavoritos.adicione(miCancion);
    }
}
