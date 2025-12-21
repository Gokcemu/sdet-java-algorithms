package easy;

public class TwoSumBruteForce {
    public static int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 15};
        int[] result = twoSumBruteForce(nums, 6);

        if (result != null) {
            System.out.println(result[0] + ", " + result[1]);
        }
    }
}

