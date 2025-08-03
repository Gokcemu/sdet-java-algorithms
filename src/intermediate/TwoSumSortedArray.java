package intermediate;

//Given a sorted array of integers, find two numbers that add up to a specific target number. Return their indices (1-based index)
public class TwoSumSortedArray {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while (left < right) {
            sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++;
            } else right--;
        }
        return new int[]{-1, -1}; // If no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("Indices are: " + result[0] + ", " + result[1]);
    }
}
