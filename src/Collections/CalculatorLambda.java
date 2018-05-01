package Collections;

import java.util.Scanner;

/**
 * Created by taoLen on 4/30/2018.
 */
public class CalculatorLambda {
    Functie a1 = (a,b) -> a+b;


    public static void main(String[] args) {
        Functie f1 = (a, b) -> a + b;
        //System.out.println(f1.add(2,3));
        Scanner sc = new Scanner(System.in);

        //varianta 1 lambda
        while(sc.hasNextInt()){
            int z = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(f1.add(z,x));
        }

        //varianta 2 lamba
//        while (sc.hasNextInt()){
//        int z = sc.nextInt();
//        int x = sc.nextInt();
//        adding((a,b) -> z+x, 10, 20);
//        }

    }

    public static void adding(Functie f, int a, int b){
        System.out.println(f.add(a,b));
    }
}

