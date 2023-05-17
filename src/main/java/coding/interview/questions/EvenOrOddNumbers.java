package coding.interview.questions;

public class EvenOrOddNumbers {
    public static void main(String[] args) throws RuntimeException{
        int[] nums = {1,12,47,88,92};
        System.out.println("---Even Number---");
        for (int num: nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("---Odd Number---");
        for (int num: nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }
}
