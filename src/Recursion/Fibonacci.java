package Recursion;

/**
 * Created by taoLen on 5/2/2018.
 */
public class Fibonacci {

    //there is always a base case in Recursion
    public static int Fibo(int n){
        if (n<=1){ return n;
        } else return Fibo(n-1)+Fibo(n-2);
    }
    public static int Factorial(int n){
        if (n == 0) return 1;
        else return n * Factorial(n-1);
    }

    public static int foo(int x) {
        if (x == 0) return 1;
        return foo(x - 1) + 1;
    }

    public static void main(String[] args) {
        int y = 5;
        //System.out.println(Fibo(10));
        //System.out.println(Factorial(5));
        System.out.println(foo(6));
    }

}
