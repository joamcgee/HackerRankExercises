package coding.interview.questions;

import java.util.*;
import java.io.*;

//input: 2 0 2 10 5 3 5
public class JavaLoopII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {

                a = a + b;
                System.out.print(a + " ");
                b = b * 2;
            }
            System.out.println("");
        }
        in.close();
    }
}


