package com.beidglabz;

import java.util.Arrays;

public class SecondLargest {
    public static int getSecondLargest(int[] arr, int total){
     Arrays.sort(arr);
       return arr[total-2];
}
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 2, 4, 9};
        System.out.println("Second largest "+getSecondLargest(arr,5));
    }
}
