package chuong5;
import java.util.Scanner;
public class baitap5_2 {
    static int LinearSearch(int a[] , int n, int x){
        for(int i=0;i<n;i++)
            if(a[i] == x)
                return i;
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri can tim: ");
        int giaTri = sc.nextInt();
        int ketqua = LinearSearch(a,a.length,giaTri);
        if(ketqua == -1)
            System.out.println("Khong tim thay gia tri: " + giaTri);
        else
            System.out.println("Gia tri can tim o chi so mang: " + ketqua);
    }
}
