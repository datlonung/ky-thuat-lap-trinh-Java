package Assignments02;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("số phần tử trong mảng là:");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }
        int S = 0;
        for (int i = 0; i < n; i++) {
            S =0;
            S += array[0] + array[n-1];
            
        }
        System.out.println("tổng giá trị đầu và giá trị cuối của mảng là: " + S);
    }
}
