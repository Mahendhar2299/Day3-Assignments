package com.bridgelabz;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array={2,5,6,2,8,5,9,1,2,5,3,6};
        int[] frequency=new int[array.length];
        int visited=-1;
        for (int i=0;i< array.length;i++){
            int count=1;
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    count++;
                    frequency[j]=visited;
                }
            }
            if (frequency[i]!=visited){
                frequency[i]=count;
            }
        }
        for (int i=0; i< frequency.length;i++){
            if (frequency[i]!=visited){
                System.out.println("Element "+array[i]+" repeats "+frequency[i]+" times");
            }
        }
    }
}
