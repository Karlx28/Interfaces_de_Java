/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author kxrmm
 */
public class Perro implements Animal{
    @Override
    public void hacerunSonido() {
        System.out.println("El perro ladrara: Guau guau");
    }
    @Override
    public void movimiento() {
        System.out.println("El perro camina");
    }
    
}
