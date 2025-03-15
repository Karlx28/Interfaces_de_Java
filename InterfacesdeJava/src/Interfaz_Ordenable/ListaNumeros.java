/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz_Ordenable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kxrmm
 */
public class ListaNumeros implements Ordenable{
    private List<Integer> numeros;

    public ListaNumeros(List<Integer> numeros) {
        this.numeros = new ArrayList<>(numeros);
    }

    @Override
    public void ordenar(List<Integer> lista) {
        Collections.sort(lista);
        System.out.println("La Lista ya ordenada: " + lista);
    }

    public void mostrarLista() {
        System.out.println("La Lista original: " + numeros);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
