package com.bridgelabz;

public class ArrayDuplicateElements {
    public static void main(String[] args) {
        int[] array={2,5,2,6,4,5,6};
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
