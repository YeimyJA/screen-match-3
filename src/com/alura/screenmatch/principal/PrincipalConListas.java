package com.alura.screenmatch.principal;

import java.util.ArrayList;

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

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula ) {
                System.out.println(pelicula.getClasificacion());   
            }   
        }
    }
}
