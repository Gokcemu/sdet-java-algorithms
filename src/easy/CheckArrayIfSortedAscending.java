package easy;
//Given an array, check whether it is sorted in ascending order.
public class CheckArrayIfSortedAscending {
    public static boolean checkArraySortedInAscending(int[] nums){

        for(int i=0; i < nums.length - 1; i++ ){
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Is the array sorted in ascending order? " + checkArraySortedInAscending(new int[]{1,3,2,4}));
        System.out.println("Is the array sorted in ascending order? " + checkArraySortedInAscending(new int[]{1,2,3,4}));
    }
}
