/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Trabajador;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        Trabajador desarrollador = new Desarrollador();
        Trabajador disenador = new Disenador();

        desarrollador.trabajar();
        disenador.trabajar();
    }
}
