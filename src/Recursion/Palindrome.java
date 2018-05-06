package Recursion;

/**
 * Created by taoLen on 5/3/2018.
 */
public class Palindrome {
    public static boolean isPalindrome(String s){
        if (s == null || s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String[] tests = {"racecar", "not", "bogus"};
        for (String test : tests) {
            System.out.printf("%s: %b\n", test, isPalindrome(test));
        }
    }
}
