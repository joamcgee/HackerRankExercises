//Write a program that outputs the string representation of numbers from 1 to n.
//But for multiples of three it should output "Fizz" instead of the number and for the
//multiples of five output "Buzz". For the numbers that are multiples of both three and five output "FizzBuzz".


package coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(10);
    }
        public static List<String> fizzBuzz(int n) {
            List<String> outputArry = new ArrayList();
            outputArry.add("1");
            outputArry.add("2");
            outputArry.add("3");
            outputArry.add("4");
            outputArry.add("5");
            outputArry.add("6");
            outputArry.add("7");
            outputArry.add("8");
            outputArry.add("9");
            outputArry.add("10");

            int fizz = 0;
            int buzz = 0;
            for(int i=1; i <= n; i++) {
              fizz++;
              buzz++;
              if (i % 3 == 0 && i % 5 == 0) {
                  outputArry.add("fizzbuzz");

              } else if (i % 3 == 0 ) {
                 outputArry.add("fizz");

              } else if (i % 5 == 0) {
                  outputArry.add("buzz");
              } else {
                  outputArry.add(Integer.toString(i));
              }

            } return outputArry;
    }
}
