//Rotate Array - Given an array, rotate the array to the right by k steps,
// where k is non-negative.

package coding.interview.questions;


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums,3);
//        for (int i=0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        Arrays.stream(nums).forEach(System.out::println);
    }
    public static void rotate(int[] nums, int k){
        k %= nums.length-1; //get the modulus value to get the actual number of rotations needed
        reverse(nums,0, nums.length-1); //calls the reverse() on the entire nums[]. reversing the order of elements. This puts the last 'k' elements at the beginning of the array.
        reverse(nums,0,k-1); //calls the reverse() on the subarray of 'nums' from index 0 to index 'k-1', reversing the order of the first 'k' elements of the array. This puts the last 'k' elements back at the end of the array.
        reverse(nums,k, nums.length-1); //calls the reverse() on the subarray of nums from index 'k' to index 'nums.length-1', reversing the order of the remaining elements of the array. This completes the array by 'k' steps.
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start]; //creates a temporary var to host the 'start' index of nums
            nums[start] = nums[end]; //sets the 'start' index of nums to the value of the 'end' index in nums
            nums[end] = temp; //sets the 'end' index in nums value to the temp var
            start++;
            end--;
        }
    }

}
