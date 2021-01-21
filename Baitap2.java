package prepare_final_test01;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        h = scanner.nextInt();
        int x, output;

        for(int i = 1;i<= h; i++){
            for(int j = 0; j<= 2*h; j++){
                x = j-h;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;

                if(output > 0){
                    System.out.print(" "+ output);
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

