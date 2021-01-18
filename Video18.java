public class Video18 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i % 5 == 0 || i % 2 == 0 || i % 3 == 0){
                continue;
            }
            System.out.println(i);
            /*
            abc
            xyz
            .....
             */
        }
    }
}
