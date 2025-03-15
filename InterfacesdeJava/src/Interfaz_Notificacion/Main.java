/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Notificacion;

/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        Notificacion correoElectronico = new Correo_Electronico();
        Notificacion mensaje = new Mensaje();

        correoElectronico.enviarNotificacion("El pedido ha sido confirmado.");
        mensaje.enviarNotificacion("El codigo de verificacion es 54769.");
    }
}
