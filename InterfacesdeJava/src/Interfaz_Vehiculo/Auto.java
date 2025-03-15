/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Vehiculo;

/**
 *
 * @author kxrmm
 */
public class Auto implements Vehiculo {
    @Override
    public void arrancar(){
        System.out.println("El auto ha arrancado");
    }
    
    @Override
    public void detener() {
        System.out.println("El auto se detuvo");
    }
}
