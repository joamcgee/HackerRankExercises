package coding.interview.questions;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables supported by switch statements char, byte, short, int, and String

        System.out.println("Enter in instructions");
        String txt = input.nextLine();

        switch (txt){
            case "run":
                System.out.println("program is running");
                break;
            case "stop":
                System.out.println("Program stopped");
                break;
            default:
                System.out.println("Instructions not recognized");

        }
    }
}
