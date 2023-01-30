import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        ArrayList<String> razasPerro = new ArrayList();

        String termina = "";

        //Ingreso las razas
        String raza;

        do {
            System.out.println("Ingrese una raza :");
            raza = input.next();
            System.out.println("Quiere ingresar otra raza? Presione S, de lo contrario cualquier tecla:");
            razasPerro.add(raza);

            termina = input.next();
        } while (termina.equalsIgnoreCase("s"));


        // Mostramos las razas
        System.out.println("Las razas ingresadas en su lista, son las siguientes: ");
        for (String razas : razasPerro) {
            System.out.println(razas);

        }
    }
}