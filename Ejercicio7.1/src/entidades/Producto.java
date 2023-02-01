package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

    private String tipo;
    private int cantidad;
    private double precioUnidad;
    private ArrayList<Producto> listProducto;

    public Producto(){
        this.listProducto = new ArrayList<>();
    }

    public Producto(String tipo, int cantidad, double precioUnidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public void CrearProducto(){
        Scanner input = new Scanner(System.in);
        Producto producto = new Producto();

        System.out.println("Ingrese el tipo de producto: ");
        tipo = input.next();
        producto.setTipo(tipo);

        System.out.println("Ingrese el stock existente del producto: ");
        cantidad = input.nextInt();
        producto.setCantidad(cantidad);

        System.out.println("Ingrese el precio por unidad del producto: ");
        precioUnidad = input.nextDouble();
        producto.setPrecioUnidad(precioUnidad);

        añadirProducto(producto);
    }

    public void añadirProducto(Producto producto){
        this.listProducto.add(producto);
    }

    public void verListado(){
        for (Producto producto : listProducto) {
            System.out.println(producto);

        }
    }

    public void ProductoMayor20() {
        for (Producto i : listProducto) {
            if (i.getPrecioUnidad() >= 20.00) {
                System.out.println(i);
            }

        }
    }

    public void ProductoMenores100() {
        for (Producto i : listProducto) {
            if (i.getPrecioUnidad() <= 100.00) {
                System.out.println(i);
            }
        }

    }


    @Override
    public String toString() {
        return
                "Tipo: " + tipo + "\n" +
                        "Cantidad: " + cantidad + "\n" +
                        "PrecioUnidad: " + precioUnidad +
                        "\n";
    }
}
