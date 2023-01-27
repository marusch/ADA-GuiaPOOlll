import Servicios.PeliculaServicio;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio servicioCarga = new PeliculaServicio();
        servicioCarga.agregarPeliculas();
        System.out.println("PELICULAS CARGADAS:");
        servicioCarga.verListaPeliculas();

        System.out.println("PELICULAS CON DURACION DE 2 HORAS O MAS HORAS:");
        servicioCarga.PeliculasMayor2Horas();

        System.out.println("PELICULAS CON DURACION MENOR A 2 HORAS:");
        servicioCarga.PeliculasMenor2Horas();


    }
}