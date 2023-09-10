package com.company;
import java.util.Scanner;
public class reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        int start =0;
        int end = size-1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];                         // a[i] = a[l-1-i]
            arr[end] = temp;
            start ++;
            end--;
        }
        System.out.println("Printing an array after Reverse");
        for(int j=0; j<size; j++){
            System.out.println(arr[j]);
        }
    }
}
