package coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class GradeMark {
    public static void main(String[] args) {
        Map<String, Integer> gradeBook = new HashMap<>();
        gradeBook.put("John", 89);
        gradeBook.put("Ally", 96);
        gradeBook.put("Carter", 78);
        gradeBook.put("Sam", 98);
        gradeBook.put("Sally", 90);

        System.out.println(gradeBook);
        System.out.println("Scholarship Recipients: ");
        for(Map.Entry<String, Integer> e: gradeBook.entrySet()) {
            if (e.getValue() >= 90 ) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
