package com.bridgelabz;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int[] array = {2, 5, 2, 6, 4, 5, 6};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
