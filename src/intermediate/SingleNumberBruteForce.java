package intermediate;

public class SingleNumberBruteForce {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1){
                return nums[i];
        }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 2, 5, 1, 3};
        System.out.println("Single number: " + singleNumber(nums));
    }
}