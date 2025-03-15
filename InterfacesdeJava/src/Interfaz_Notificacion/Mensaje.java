/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Notificacion;

/**
 *
 * @author kxrmm
 */
public class Mensaje implements Notificacion{
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando su SMS: " + mensaje);
    }
}
