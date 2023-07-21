package com.beidglabz;

public class Frequency {
    public static void main(String[] args) {
        int []arr = new int[]{3,5,4,8,2,3,6,5,};
        int []freq = new int[arr.length];
        int visited = -1;
        for(int i=0;i< arr.length;i++){
            int count = 1;
            for(int j =i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            if(freq[i]!=visited);
            freq[i] = count;
        }
        // Displays the frequency
        System.out.println("-----------------------");
        System.out.println("Frequency of elements ");
        System.out.println("-----------------------");
        for(int i=0;i< arr.length;i++){
            if(freq[i]!=visited){
                System.out.println("  "+arr[i]+"   "+freq[i]);
            }
        }
    }
}
