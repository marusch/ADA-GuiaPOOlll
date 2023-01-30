import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        ArrayList<String> razasPerro = new ArrayList();

        boolean encontro = false;
        String termina = "";

        //Ingreso las razas
        String raza;

        do {
            System.out.println("Ingrese una raza de perro:");
            raza = input.next();
            System.out.println("Quiere ingresar otra raza? Presione S, de lo contrario cualquier tecla para salir:");
            razasPerro.add(raza);

            termina = input.next();
        } while (termina.equalsIgnoreCase("s"));


        // Mostramos todas las razas
        System.out.println("\n" + "Las razas ingresadas en su lista, son las siguientes: ");
        for (String razas : razasPerro) {
            System.out.println(razas);

        }


        //Segunda Parte - EJ3

        //Buscador de raza
        System.out.println("\n" + "Ingrese la raza que desea eliminar: ");
        String eliminar = input.next();
        Iterator<String> iterador = razasPerro.iterator();
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            if (elemento.equals(eliminar)) {
                iterador.remove();
                encontro = true;

            }
        }
        if (!encontro) {
            System.out.println("La raza de perro ingresada no se encuentra en la lista");
        }

        //Mostramos las razas actualizadas, si es que se elimino alguna
        System.out.println("\n" + "La lista de razas actual: ");
        for (String razas : razasPerro) {
            System.out.println(razas);
        }
    }
}