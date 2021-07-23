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
        int[] inputVector = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        //sortedVector = {0, 1, 2, 65, 66, 90, 78, 13, 12, 11};
        int[] sortedVector = Examen4.customSort(inputVector);
        //int[]salida2= Examen4.descendingOrder(inputVector, 5);
        System.out.println("\n");
        Examen4.print(sortedVector);
    }

}
