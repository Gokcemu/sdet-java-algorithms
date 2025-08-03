package easy;

//Given an integer array, calculate and return the sum of all elements.

public class SumOfElements {
    public static int sumOfElements(int[] nums){
        int sumOfElements = 0;
        for(int i =0; i < nums.length ; i++){
            sumOfElements += nums[i];
        }
        return sumOfElements;
    }

    public static void main(String[] args){
        System.out.println("Sum of Elements equals: " + sumOfElements(new int[]{1,2,3,4}));
    }
}
