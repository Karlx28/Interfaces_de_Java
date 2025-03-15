/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Pago;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args){
        Pago pagoTarjeta = new PagoTarjeta();
        Pago pagoEfectivo = new PagoEfectivo();
        
        pagoTarjeta.procesarelPago(175.80);
        pagoEfectivo.procesarelPago(50.25);
    }
}
