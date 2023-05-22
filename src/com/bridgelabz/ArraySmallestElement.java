package com.bridgelabz;

public class ArraySmallestElement {
    public static void main(String[] args) {
        int[] array={2,5,26,6,19,25,1};
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
