//You are given an array of Integers in which each subsequent value is not less than previous value.
// Write a function that takes this array as an input and returns a new array with the squares of each number sorted in ascending order.


package coding.interview.questions;


public class SortedSquaredArry {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int num : nums) {
            System.out.println(num);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Math.pow(i,2));
        }
    }
}
