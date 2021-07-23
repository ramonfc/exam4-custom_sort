package com.misiontic.examen4;

/**
 * Resolving the test Class to contain the customSort method that receives as a
 * parameter a vector of integers of even length, its job will be to return the
 * ordered vector in the next way: -The first half of the values must be sorted
 * ascending -The second half of the values must be sorted descending
 *
 * @author Ramon
 */
public class Examen4 {

    /**
     * Receives a vector and sorts it, the first half is sorted ascending and
     * the second half is sorted descending. To do it was invoked two
     * implemented methods, ascendingOrder and descendingOrder. To fill the
     * returned vector was used the System.arraycopy method, merging the two
     * sorted parts inside one vector.
     *
     * @param vector
     * @return sortedVector
     */
    public static int[] customSort(int[] vector) {

        int[] sortedVector = new int[vector.length];
        int middle = vector.length / 2;
        int[] ascend = ascendingOrder(vector, middle - 1);
        int[] descend = descendingOrder(vector, middle);

        System.arraycopy(ascend, 0, sortedVector, 0, middle);
        System.arraycopy(descend, middle, sortedVector, middle, middle);
        return sortedVector;
    }

    /**
     * Sorts a vector from 0 index until a given index in ascending way using an
     * implementation of the direct insert sort method.
     *
     * @param input : vector to be sorted
     * @param end : index until the method will sort the vector
     * @return A : sorted array. Being a copy of the input vector
     */
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

    /**
     * Sorts a vector from a given index until a given last index in descending
     * way using an implementation of the direct insert sort method.
     *
     * @param input : vector to be sorted
     * @param start : index from the method will be start to sort
     * @return A : sorted vector
     */
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

    /**
     * Shows in console a vector
     *
     * @param v : vector to be shown
     */
    public static void print(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
    }
}
