package Recursion;

/**
 * Created by taoLen on 5/2/2018.
 */
public class Pow {
    public static long pow2n(long n){
        if (n == 0)
            return 1;
        else if (n == 1)
            return 2;
        else {
            long t = pow2n(n / 2);
            if (n % 2 == 0)
                return t * t;
            else
                return  2 * t * t;
        }
    }

    public static void main(String[] args) {
//        for (long n = 0; n <= 16; n++){
//            System.out.printf("%d: %d\n", n, pow2n(n));
//        }
        System.out.println(pow2n(6));
    }
}
