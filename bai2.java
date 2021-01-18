import java.util.Scanner;
//Viết một chương trình tính giai thừa của một số nguyên dương n. Với n được nhập từ bàn phím. Ví dụ, n = 8 thì kết quả đầu ra phải là 1*2*3*4*5*6*7*8 = 40320.
    public class bai2 {
        private static Scanner scanner = new Scanner(System.in);
        /**
         * main
         *
         * @author viettuts.vn
         * @param args
         */
        public static void main(String[] args) {
            System.out.print("Nhập số nguyên dương n = ");
            int n = scanner.nextInt();
            System.out.println("Giai thừa của " + n + " là: " + tinhGiaithua(n));
        }

        /**
         * tinh giai thua
         *
         * @author viettuts.vn
         * @param n: so nguyen duong
         * @return giai thua cua so n
         */
        public static long tinhGiaithua(int n) {
            if (n > 0) {
                return n * tinhGiaithua(n - 1);
            } else {
                return 1;
            }
        }
    }

