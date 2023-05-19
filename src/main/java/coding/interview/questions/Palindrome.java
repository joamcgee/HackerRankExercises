package coding.interview.questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        checkPalindrome(A);

    }

    public static void checkPalindrome(String A) {
        String B = new StringBuilder(A).reverse().toString(); //Will reverse the A string and host in B variable.
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } return;
    }
}
