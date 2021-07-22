/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.examen4;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Ramon
 */
public class Examen4 {

    public static int[] ordenamientoPersonalizado(int[] vector) {

        int[] vectorOrdenado = new int[vector.length];
        int middle = vector.length/2;
        int[] ascendente = ascendingOrder(vector, middle - 1);
        int[] descendente = descendingOrder(vector, middle);

        System.arraycopy(ascendente, 0, vectorOrdenado, 0, middle);
        System.arraycopy(descendente, middle, vectorOrdenado, middle, middle);
        return vectorOrdenado;
    }

    public static int[] ascendingOrder(int[] input, int end) {
        int[] A = new int[input.length];
        System.arraycopy(input, 0, A, 0, input.length);
        int i, j;
        int aux;
        for (i = 1; i <= end; i++) {
            aux = A[i];
            j = i - 1;
            while ((j >= 0) && (aux < A[j])) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
        return A;
    }

    public static int[] descendingOrder(int[] input, int start) {
        int[] A = new int[input.length];
        System.arraycopy(input, 0, A, 0, input.length);
        int i, j;
        int aux;
        for (i = start; i < input.length; i++) {
            aux = A[i];
            j = i - 1;
            while ((j >= start) && (aux > A[j])) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
        return A;
    }

    public static void print(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
    }
}
