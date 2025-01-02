package com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(6);
        var peliculaDeYeimy = new Pelicula("El señor de los anillos",2001);
        peliculaDeYeimy.evalua(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList< Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeYeimy);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);

        for(Titulo item : lista) {
            System.out.println("Nombre: " +item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: "+pelicula.getClasificacion());
            }
        }
        
        ArrayList<String> listadeArtistas = new ArrayList<>();
        listadeArtistas.add("Penelope Cruz");
        listadeArtistas.add("Antonio Banderas");
        listadeArtistas.add("Ricardo Darin");
        System.out.println( "lista:   " + listadeArtistas);

        Collections.sort(listadeArtistas);
        System.out.println("Lista de artista ordenadas: "+listadeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenadas: "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha "+lista);
    }
}
