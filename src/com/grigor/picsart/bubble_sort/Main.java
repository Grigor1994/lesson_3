package com.grigor.picsart.bubble_sort;

public class Main {

    public static void main(String[] args) {
        int[] array = {52, 26, 1, 3, 5, 14, 6, 9, 7, 841, 42, 30};
        for (int k : array) {
            System.out.print(k + " ");
        }
        bubbleSort(array);
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j]) {
                    int tmp = array[j -1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
