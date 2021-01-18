import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau thu nhat: ");
        String s1 = sc.next();
        System.out.println("Nhap xau thu hai: ");
        String s2 = sc.next();

        System.out.println(s1.contains(s2));
    }
}

