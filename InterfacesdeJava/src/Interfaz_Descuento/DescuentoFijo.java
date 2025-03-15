/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Descuento;

/**
 *
 * @author kxrmm
 */
public class DescuentoFijo implements Descuento {
    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double calcularelDescuento(double precio) {
        return precio - cantidadFija;
    }
}
