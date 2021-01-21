package chuong5;

import java.util.Scanner;

public class baitap5_3 {
     public static int max(int arr[],int n){
        int max = arr[0];
        for(int i=0;i<n;i++)
            if(max < arr[i])
                max = arr[i];
            return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Gia tri lon nhat: "+ max(arr,n) );

    }
}
