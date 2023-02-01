package entidades;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracionHora;
    private ArrayList<Pelicula> listaPeliculas;

    public Pelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    public Pelicula(String titulo, String director, int duracionHora) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHora = duracionHora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionHora() {
        return duracionHora;
    }

    public void setDuracionHora(int duracionHora) {
        this.duracionHora = duracionHora;
    }

    public void CrearPelicula(String titulo, String director, int duracionHora){
        Pelicula pelicula = new Pelicula();

        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setDuracionHora(duracionHora);


        añadirPelicula(pelicula);
    }

    public void añadirPelicula(Pelicula pelicula){
        this.listaPeliculas.add(pelicula);
    }


    public void verListaPeliculas() {
        for (Pelicula i : listaPeliculas) {
            System.out.println(i);
        }
    }

    public void PeliculasMayor2Horas() {
        for (Pelicula i : listaPeliculas) {
            if (i.getDuracionHora() >= 2) {
                System.out.println(i);
            }

        }
    }

    public void PeliculasMenor2Horas() {
        for (Pelicula i : listaPeliculas) {
            if (i.getDuracionHora() < 2) {
                System.out.println(i);
            }

        }
    }

    @Override
    public String toString() {
        return
                "Titulo: " + titulo + "\n" +
                        "Director: " + director + "\n" +
                        "Duracion: " + duracionHora + "\n";
    }
}
