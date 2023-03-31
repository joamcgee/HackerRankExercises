//Array is monotonic if it is either monotone increasing or monotone decreasing.
//An array is monotone increasing if all its elements from left to right are non-decreasing.
//An array is monotone decreasing if all its elements from left to right are non-increasing.
// Given an integer array return true if the given array is monotonic, or else otherwise.
package coding.interview.questions;


public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,4,5};
        int[] nums2 = {5,4,44,3,2,1};

        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
    }
        public static boolean isMonotonic(int[] A) {
            boolean increasing = true;
            boolean decreasing = true;

            //use "length-1" because we want to check two elements at a time, the current element and the next.
            // If the -1 is not used the console will go out of the array boundary
            for(int i=0; i < A.length-1; i++) {
                if(A[i] > A[i+1]) increasing = false;
                if(A[i] < A[i+1]) decreasing = false;
            }
            // "||" is a type of logical operator used to perform "logical OR" operation and read as "OR OR" or "Logical OR". Helps eliminate boilerplate code
            return increasing || decreasing;

//            if (increasing) return true;
//            if (decreasing) return true;
//            return false;
        }
}
