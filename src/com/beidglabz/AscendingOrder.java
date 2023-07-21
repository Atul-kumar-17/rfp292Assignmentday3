package com.beidglabz;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] arr = {8,9,2,3,7,4,6,5,1};
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
