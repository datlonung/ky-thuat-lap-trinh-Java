public class Video04 {
    int x = 0;
    {
        int x = 99;
        System.out.println(x);//OK
        // a block of code
        {
            //khoi
        }
        System.out.println(x);//OK
    }
    //other block
}
