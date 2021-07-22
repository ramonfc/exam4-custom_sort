/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.examen4;

/**
 *
 * @author Ramon
 */

public class Main {    

    public static void main(String[] args) {
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};       
        //int [] vectorEntradaOrdenado = {0, 1, 2, 65, 66, 90, 78, 13, 12, 11};
        int[] salida1 = Examen4.ordenamientoPersonalizado(vectorEntrada);
         //int[]salida2= Examen4.descendingOrder(vectorEntrada, 5);
        System.out.println("\n");
       Examen4.print(salida1);
    }

}
