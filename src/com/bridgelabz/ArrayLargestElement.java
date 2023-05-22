package com.bridgelabz;

public class ArrayLargestElement {
    public static void main(String[] args) {
        int[] array={2,5,26,6,19,25};
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
