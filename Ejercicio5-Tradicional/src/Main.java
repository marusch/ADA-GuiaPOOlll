import entidades.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Alumno listaAlumno = new Alumno();
        String nombre;
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String termina = "";

       //Lista cargada
        listaAlumno.CrearAlumno("Fer", 10, 9, 8);
        listaAlumno.CrearAlumno("Marina", 4, 3, 7);
        listaAlumno.CrearAlumno("Fatima", 10, 10, 8);


        System.out.println("Carga de alumnos a la lista: ");
        do {

            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la primer nota");
            nota1=leer.nextInt();
            System.out.println("Ingrese la segunda nota");
            nota2=leer.nextInt();
            System.out.println("Ingrese la tercer nota");
            nota3=leer.nextInt();

            System.out.println("Si desea ingresar otro alumno, presione S, de lo contrario cualquier tecla");
            termina= leer.next();
            listaAlumno.CrearAlumno(nombre, nota1, nota2, nota3);


        } while (termina.equalsIgnoreCase("s"));


        System.out.println("\n" + "Lista de alumnos");
        listaAlumno.verListado();

    }
}