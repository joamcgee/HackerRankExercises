package coding.interview.questions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> vowels = List.of('a','e','i','o','u'); //list of vowels
        List<Character> vowelsFromString = new ArrayList<>(); //empty Arraylist to host vowels from string
        int count = 0;

        for(char c : str.toCharArray()){ //for each character in the string variable, store in character array.
            if(vowels.contains(Character.toLowerCase(c))) { // if vowels list contains a character from the string-char-array.
                vowelsFromString.add(c); //add the character to vowelsFromString Arraylist.
                count++; //add to the count for the number of matching characters
            }

        }
        System.out.println("Here's the list of vowel in the string: " + vowelsFromString);
        System.out.println("The number of vowel characters in the string: "+ count);
    }
}
