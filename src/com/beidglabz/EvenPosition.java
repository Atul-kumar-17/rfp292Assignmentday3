package com.beidglabz;

public class EvenPosition {
    public static void main(String[] args) {
        int [] arr ={10,11,12,13,14,15};
        System.out.println("Even position Elements");
        for(int i =1;i< arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
