/*A prime number is a natural number greater than  whose only positive divisors are 1 and itself. For example,
the first six prime numbers are 2,3,5,7,11, and 13.

Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.*/


package coding.interview.questions;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        System.out.println(n.isProbablePrime(100)?"Prime":"Not prime");
    }
}
