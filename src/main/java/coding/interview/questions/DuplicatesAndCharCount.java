package coding.interview.questions;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesAndCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char c: chars) {
            if (characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c, characterIntegerMap.get(c)+1);
            }else {
                characterIntegerMap.put(c, 1);
            }
        }
        System.out.println(characterIntegerMap);
    }
}