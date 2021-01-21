package Assignments02;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("số phần tử trong mảng là: ");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t" + "\n");
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(" số chẳn là: " + array[i] + "\t");
            }
        }
    }
}
