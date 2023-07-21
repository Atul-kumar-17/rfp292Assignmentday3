package com.beidglabz;

public class LargestElement {
    public static int getLargest(int []arr,int total){
        int temp;
        for(int i =0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total-1];
    }

    public static void main(String[] args) {
        int [] arr ={10,50,2,3,60};
        System.out.println("Largest element "+getLargest(arr,5));
    }
}
