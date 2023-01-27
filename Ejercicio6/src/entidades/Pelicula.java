package entidades;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracionHora;

    public Pelicula() {
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

    @Override
    public String toString() {
        return
                "Titulo: " + titulo + "\n" +
                "Director: " + director + "\n" +
                "Duracion: " + duracionHora + "\n";
    }
}

