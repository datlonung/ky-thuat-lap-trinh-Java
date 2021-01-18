public class Video12 {
    public static void main(String[] args) {
        int a = 5;
        float mark = 2.5f;
        if (mark >= 9.0) {
            System.out.println("SX");
        } else if (mark >= 8.0 && mark <= 8.9) {
            System.out.println("GIOI");
        } else if (mark >= 7.9 && mark <= 6.5) {
            System.out.println("KHA");
        } else {
            int x = 200;// Phat vi ngu
            System.out.println("TB");
            System.out.println("Ban bi phat ngu phi la: "+ x);
        }
    }
}
