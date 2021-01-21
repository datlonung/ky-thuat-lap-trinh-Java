package chuong5;

import java.util.Scanner;

public class baitap5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập m (số hàng): ");
        int m = scanner.nextInt();
        System.out.print("Nhập n (số cột): ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMảng trước khi hoán vị: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nMảng sau khi hoán vị: ");
        for (int j = 0; j < n; j++) {
            int temp = a[1][j];
            a[1][j] = a[2][j];
            a[2][j] = temp;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
