package coding.interview.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("This is the reverse of "+ num + ": " + getNumReversed(num));


    }
    public static int getNumReversed(int num) {
            StringBuffer num2 = new StringBuffer(String.valueOf(num));
            StringBuffer temp = num2.reverse();
            int reverse = Integer.parseInt(String.valueOf(temp));
            return reverse;
    }
}
