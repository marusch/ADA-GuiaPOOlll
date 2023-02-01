import entidades.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Producto producto = new Producto();
        String fin="";


        System.out.println("Sistema de productos. A continuacion indique los siguientes datos: ");
        do {
            producto.CrearProducto();

            System.out.println("Si desea ingresar otro producto, Presione S, " +
                    " de lo contrario para salir, cualquier tecla");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de productos");
        producto.verListado();

        System.out.println("\n" + "Lista de productos mayores a 20$ :");
        producto.ProductoMayor20();

        System.out.println("\n" + "Lista de productos menores a $100 :");
        producto.ProductoMenores100();


    }
}