package com.beidglabz;

public class ReverseOrder {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        System.out.println("Orginal Array");
        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse Array");
        for(int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
