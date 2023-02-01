import entidades.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Pelicula servicioCarga = new Pelicula();
         String titulo;
         String director;
         int duracionHora;
         String fin="";

        System.out.println("Sistema de carga de Peliculas - Ingrese los siguientes datos");
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            titulo = input.next();

            System.out.println("Ingrese su director");
            director = input.next();

            System.out.println("Ingrese su duracion, en horas");
            duracionHora = input.nextInt();

            System.out.println("Para ingresar otro pelicula presione S, de lo contrario cualquier tecla.");
            fin= input.next();

            servicioCarga.CrearPelicula(titulo, director, duracionHora);

        }while (fin.equalsIgnoreCase("s"));


        System.out.println("PELICULAS CARGADAS:");
        servicioCarga.verListaPeliculas();

        System.out.println("PELICULAS CON DURACION DE 2 HORAS O MAS HORAS:");
        servicioCarga.PeliculasMayor2Horas();

        System.out.println("PELICULAS CON DURACION MENOR A 2 HORAS:");
        servicioCarga.PeliculasMenor2Horas();
    }
}