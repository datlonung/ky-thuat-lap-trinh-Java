package Assignments02;

import java.util.Scanner;

public class Bai4 {
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
        System.out.println("Các phần tử dòng 3 là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 2) {
                    if (j < m) {
                        System.out.print(A[i][j] + "\t");
                    }
                }
            }
        }
    }
}
