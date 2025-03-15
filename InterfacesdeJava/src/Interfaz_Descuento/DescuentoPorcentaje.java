/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Descuento;

/**
 *
 * @author kxrmm
 */
public class DescuentoPorcentaje implements Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularelDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
}
