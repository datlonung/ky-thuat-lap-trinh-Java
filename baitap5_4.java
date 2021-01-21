package chuong5;

import java.util.Scanner;

public class baitap5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int n = scanner.nextInt();


        int[][] a = new int[m][n];
        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng trước khi sắp xếp: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i][k] < a[i][j]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
