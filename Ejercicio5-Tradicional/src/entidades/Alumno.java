package entidades;

import java.util.ArrayList;

public class Alumno {
    String nombre;
    private ArrayList<Integer> nota;

    private ArrayList<Alumno> listaAlumnos;

    public Alumno() {
        this.listaAlumnos = new ArrayList();
    }

    public Alumno(ArrayList<Alumno> alumnos) {
        this.listaAlumnos = alumnos;
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


    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }



    public void CrearAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();

        alumno.setNombre(nombre);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNota(notas);

        añadirAlumno(alumno);

    }

    public void añadirAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void verListado(){
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());

        }

    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                " - Notas: " + nota;
    }
}
