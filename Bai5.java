package Assignments02;

import java.util.Scanner;

public class Bai5 {
    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Phân tử thứ " + i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(checkSNT(a[i])){
                System.out.println("Số nguyên tố là: " + a[i]+ " ");
            }
        }
    }

}
