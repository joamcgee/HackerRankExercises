package coding.interview.questions;

import com.sun.tools.jconsole.JConsoleContext;

public class FinalIdentifier {
     static final int varA = 5;
    static final int varB = 5;

    public static void main(String[] args) {
        int varC = varA+varB;
            System.out.println(varC);

    }
}
