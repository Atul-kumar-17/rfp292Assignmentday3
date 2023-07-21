package com.beidglabz;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        // 1> First way of printing array
        int[] arr1 = new int[5]; // initialization
        arr1[0] = 5;
        arr1[1] = 7;
        arr1[2] = 8;
        arr1[3] = 9;
        arr1[4] = 6;
        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);
        System.out.println("Second way ");
        int []arr2 = {2, 6, 5, 3, 6}; // declaration,instantiation;initialization;
       for(int j=0;j< arr2.length;j++){
           System.out.println(arr2[j]);
       }
        System.out.println("Using for each loop ");
       int [] arr3 = {11,12,15,16,17};
        for (int i:arr3)
            System.out.println(i);
        System.out.println("Using Scanner class");
        Scanner Sc = new Scanner(System.in);
        int [] arr4 = new int[5];
        for (int i =0 ; i<5; i++){
            System.out.println("Enter a number");
            arr4[i] = Sc.nextInt();
        }
        for (int i =0; i <5; i++){
            System.out.println(arr4[i]);
        }
    }
}
