package coding.interview.questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        String B = new StringBuilder(A).reverse().toString().toLowerCase();

        if(A.equals(B)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}















