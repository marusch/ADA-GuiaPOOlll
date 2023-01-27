import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> lisNombres = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de nombres para su lista");
        int cantidad = input.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un nombre para completar su lista");
            String nombres = input.next();
            lisNombres.add(nombres);
        }

        lisNombres.remove(3);
        lisNombres.remove(1);

        Collections.sort(lisNombres);
        System.out.println("El tamaño de la lista es el siguiente: " + lisNombres.size());

        for (String Lista : lisNombres) {
            System.out.println(Lista);
        }

    }
}