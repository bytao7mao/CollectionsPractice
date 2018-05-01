package Collections;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by taoLen on 4/30/2018.
 */
public class TreeMap {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = 0;
//        while (in.hasNextInt()){
//            n = in.nextInt();
//
//            if (n % 2 == 0){
//                System.out.println("Even number");
//            } else {
//                System.out.println("Odd number");
//            }
//        }
//        System.out.println(n);
        Scanner scn = new Scanner(System.in);
        int sum=0,count = 0;
        while (scn.hasNextInt()){
            int n = scn.nextInt();
            sum+=n;
            ++count;
        }
        System.out.printf("sum of %d values is %d\n", count, sum);
    }

}
