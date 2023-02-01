import entidades.Producto;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Producto producto = new Producto();

         String tipo;
         int cantidad;
         double precioUnidad;
         String termina="";

        System.out.println("Carga de productos a la lista: ");
        do {

            System.out.println("Ingrese el tipo de producto");
            tipo = leer.next();
            System.out.println("Ingrese la cantidad existente del producto");
            cantidad=leer.nextInt();
            System.out.println("Ingrese el precio por unidad");
            precioUnidad=leer.nextInt();


            System.out.println("Si desea ingresar otro producto, presione S, de lo contrario cualquier tecla para salir");
            termina= leer.next();


            producto.CrearProducto(tipo, cantidad, precioUnidad);

        } while (termina.equalsIgnoreCase("s"));


        System.out.println("\n" + "Lista de Productos");
        producto.verListado();

        System.out.println("\n" + "Lista de Productos mayores a 20$");
        producto.ProductoMayor20();

        System.out.println("\n" + "Lista de Productos menores a 100$");
        producto.ProductoMenores100();


    }
}