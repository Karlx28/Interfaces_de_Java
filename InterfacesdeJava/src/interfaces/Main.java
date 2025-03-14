/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args){
        Animal perro = new Perro();
        Animal gato = new Gato();
        
        perro.hacerunSonido();
        perro.movimiento();
        
        gato.hacerunSonido();
        gato.movimiento();
    }
}
