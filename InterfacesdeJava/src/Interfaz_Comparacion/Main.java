/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Comparacion;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Consola", 1200.50);
        Producto producto2 = new Producto("Camara", 850.99);

        producto1.mostrarInfo();
        producto2.mostrarInfo();

        int resultado = producto1.comparar(producto2);

        if (resultado > 0) {
            System.out.println("El producto " + producto1.getPrecio() + " es mas caro que " + producto2.getPrecio());
        } else if (resultado < 0) {
            System.out.println("El producto " + producto2.getPrecio() + " es mas caro que " + producto1.getPrecio());
        } else {
            System.out.println("Ambos productos valen lo mismo.");
        }
    }
}
