/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Comparacion;

/**
 *
 * @author kxrmm
 */
public class Producto implements ObjetoComparable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof Producto) {
            Producto otro = (Producto) o;
            return Double.compare(this.precio, otro.precio);
        }
        return 0;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    } 
}
