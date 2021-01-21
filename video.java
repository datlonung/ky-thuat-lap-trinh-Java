package chuong5;

import java.util.Random;

// thuat toan sap xep noi bot
public class video {
    public void sapxep(int a[],int n){
        for(int j=0;j<n;j++){
            for(int i=n-1;i>j;i--){
                if(a[i]>a[i-1]){
                    int b=a[i];
                    a[i]=a[i-1];
                    a[i-1]=b;
                }
            }
        }
    }

    public static void main(String[] args) {
        video j= new video();
        int n=10;
        Random x = new Random();
        int mang[] =new int[n];
        for(int i=0;i<n;i++){
            mang[i]= x.nextInt(100);
        }
        for(int i=0;i<n;i++){
            System.out.print(mang[i] + " ");
        }
        System.out.println("");
        j.sapxep(mang,n);
        for(int i=0;i<n;i++){
            System.out.print(mang[i] + " ");
        }
    }
}
