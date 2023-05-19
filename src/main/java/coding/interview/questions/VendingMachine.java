package coding.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Map<Character,String> vendingMachine = new HashMap<>();
        vendingMachine.put('A',"Cheeze-Its");
        vendingMachine.put('B',"Cookies");
        vendingMachine.put('C',"Donuts");
        vendingMachine.put('X',"Lemonade");
        vendingMachine.put('Y',"Fruit Punch");
        vendingMachine.put('Z',"Sweet Tea");

        for(Map.Entry<Character,String> e: vendingMachine.entrySet()) {
            System.out.println("Key: " + e.getKey() + "  Snack/Drink: " + e.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "WHAT WOULD YOU LIKE"+"\n"+"Enter Key: ");
        char key = sc.next().charAt(0);

        if(key != '\u0000') {
            System.out.println(vendingMachine.get(key));
        }
    }
}
