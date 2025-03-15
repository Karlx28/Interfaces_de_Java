/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Pago;

/**
 *
 * @author kxrmm
 */
public class PagoEfectivo implements Pago{
    @Override
    public void procesarelPago(double cantidad){
        System.out.println("Pago $" + cantidad + " realizado en efectivo");
    }
    
}
