package chuong5;

import java.util.Scanner;

public class baitap5_6 {
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

        System.out.println("\nMảng vừa nhập là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            System.out.print("Giá trị lớn nhất hàng "+ (i+1)+ " là: ");
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
    }
}
