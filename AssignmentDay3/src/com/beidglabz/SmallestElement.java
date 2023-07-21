package com.beidglabz;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr ={11,40,35,24,20,9};
        int min = arr[0];
        for(int i =0;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("Smallest Element "+min);
    }
}

