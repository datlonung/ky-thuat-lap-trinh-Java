package chuong5;

import java.util.Scanner;

public class baitap5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu: " +i);
            arr[i] =sc.nextInt();
        }
        int temp =arr[0];
        for(int i=0;i< arr.length ; i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Thu tu giam dan la: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
    }
}

