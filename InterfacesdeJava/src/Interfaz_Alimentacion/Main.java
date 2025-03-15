/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Alimentacion;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        Alimentacion persona = new Persona();
        Alimentacion animal = new Animal();

        persona.comer();
        animal.comer();
    }
}
