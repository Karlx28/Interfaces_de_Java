/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Ordenable;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author kxrmm
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 9, 2);
        ListaNumeros listadeNumeros = new ListaNumeros(numeros);
        
        listadeNumeros.mostrarLista();
        listadeNumeros.ordenar(listadeNumeros.getNumeros());
    }

}
