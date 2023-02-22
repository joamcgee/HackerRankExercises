import java.util.*;
import java.util.Scanner;

//Task:
//        Given an integer, n, perform the following conditional actions:
//
//        If n is odd, print Weird
//        If n is even and in the inclusive range of 2 to 5, print Not Weird
//        If n is even and in the inclusive range of 6 to 20, print Weird
//        If n is even and greater than 20, print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
//
//        Input Format
//
//        A single line containing a positive integer, n.


public class IfElse {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        if (N % 2 > 0) {
            System.out.println("Weird");
        } else {
            if(N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else {
                if (N >=6 && N <=20) {
                    System.out.println("Weird");
                } else if (N > 20) {
                    System.out.println("Not Weird");
                }

            }
        }
        scan.close();
    }

}
