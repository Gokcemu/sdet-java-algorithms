package easy;

public class FindMaximumNumberInArray {
    public static int findMaxNumber(int[] nums){
        int max = nums[0];

        for(int i =1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {5, 9, 3, 15, 7};
        System.out.println("Maximum number is: " + findMaxNumber(nums));
    }
}
