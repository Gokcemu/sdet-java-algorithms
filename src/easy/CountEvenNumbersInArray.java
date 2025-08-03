package easy;

//Given an integer array, count how many even numbers it contains.
public class CountEvenNumbersInArray {
    public static int countEvenNumbers(int[] nums){
        int countEvenNumbers =0;
        for(int i = 0; i < nums.length; i ++){
            if (nums[i] % 2 == 0) {
                countEvenNumbers += 1;
            }
        }
        return countEvenNumbers;
    }
    public static void main(String[] args){
        System.out.println("Even number count in array: " + countEvenNumbers(new int[]{1,2,3,4,6,8,0}));
    }
}
