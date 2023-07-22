/*Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.
Note: You may find the String.split method helpful in completing this challenge.
Input: He is a very very good boy, isn't he?*/

package coding.interview.questions;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim(); //trim eliminates the leading and ending spaces of the string
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^a-zA-Z]+"); //split will split the string into an array of substrings. Eliminating the non-alphabetic characters of the string.
        System.out.println(words.length); //prints the number/length of strings in the array

        for (String word : words) {
            System.out.println(word); //prints each word in the Strings[]
        }
    }
}
