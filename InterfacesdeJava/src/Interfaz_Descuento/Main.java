/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Descuento;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10% de descuento
        Descuento descuentoFijo = new DescuentoFijo(50); // $50 de descuento

        double precioOriginal = 200.0;

        System.out.println("El Precio original es: " + precioOriginal);
        System.out.println("Precio con el descuento por porcentaje: " + descuentoPorcentaje.calcularelDescuento(precioOriginal));
        System.out.println("Precio con el descuento fijo: " + descuentoFijo.calcularelDescuento(precioOriginal));
    }
}
