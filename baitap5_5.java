package chuong5;

import java.util.Scanner;

public class baitap5_5 {
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

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: ");
        System.out.print(max);
    }
}
