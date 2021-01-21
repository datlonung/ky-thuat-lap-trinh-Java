package Assignments02;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        n = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int Dem =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] % 2 ==0) {
                    Dem++;
                }
            }
        }
        System.out.println("Số các số lẻ là: "+ Dem);
    }
}

