/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_FiguraGeometrica;

/**
 *
 * @author kxrmm
 */
public class Main {
        public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);

        System.out.println("El Area del circulo es: " + circulo.area());
        System.out.println("El Perimetro del circulo es: " + circulo.perimetro());

        System.out.println("El Area del rectangulo es: " + rectangulo.area());
        System.out.println("El Perimetro del rectangulo es: " + rectangulo.perimetro());
    }
}
