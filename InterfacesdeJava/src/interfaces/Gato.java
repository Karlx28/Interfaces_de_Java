/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author kxrmm
 */
public class Gato implements Animal{
    @Override
    public void hacerunSonido() {
        System.out.println("El gato maulla: Miau miau");
    }
    
    @Override
    public void movimiento(){
        System.out.println("El gato corre");
    }
    
}
