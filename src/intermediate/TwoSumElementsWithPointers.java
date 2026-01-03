package intermediate;

public class TwoSumElementsWithPointers {

    /**
     * Two pointers solution for a SORTED array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int[] TwoSumElementsWithPointers(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return null;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left, right };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 15};
        int[] result = TwoSumElementsWithPointers(nums, 6);

        if (result != null) {
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}
