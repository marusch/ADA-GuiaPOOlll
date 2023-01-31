package entidades;

import java.util.ArrayList;


public class Alumno {

    String nombre;
    private ArrayList<Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                "- Notas: " + nota ;
    }
}
