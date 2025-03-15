/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Vehiculo;

/**
 *
 * @author kxrmm
 */
public class Bicicleta implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La bicicleta empieza a moverse");
    }
    
    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo");
    }
}
