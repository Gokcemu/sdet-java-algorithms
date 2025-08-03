package intermediate;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static void reverseArrayInPlace(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            System.out.println(nums[right]);

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverseArrayInPlace(nums);
        System.out.println("Reversed Array: " + Arrays.toString(nums));
}
}
