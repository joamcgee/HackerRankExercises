//Task
//  Write the following code in the unlocked portion of your editor:
//  Create an array, , capable of holding  integers.
//  Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
//  For example, the first value must be stored in , the second value must be stored in , and so on.
// input:
// The first line contains a single integer, n, denoting the size of the array.
// Each line i of the n subsequent lines contains a single integer denoting the value of element .


import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
