/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Vehiculo;

/**
 *
 * @author kxrmm
 */
public class Main {
        public static void main(String[] args){
            // Para los Vehiculos
        Vehiculo auto = new Auto();
        Vehiculo bicicleta = new Bicicleta();
        
        auto.arrancar();
        auto.detener();
        
        bicicleta.arrancar();
        bicicleta.detener();
    }
}
