import java.util.Scanner;

public class Baitap1 {
    private static Scanner input;

    // nhap vao mot
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        n = scanner.nextInt();
        if (n >= 2) {
            if (n % 2 == 0) {
                System.out.println("La so chan");
            } else {
                System.out.println("La so le");
            }
        }
    }
}






