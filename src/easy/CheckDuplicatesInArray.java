package easy;

//Given an integer array, determine if it contains any duplicates.
public class CheckDuplicatesInArray {
    public static boolean checkDuplicatesInArray(int[] nums){
        for(int i = 0; i < nums.length ; i++){
            for( int j = i + 1 ; j < nums.length - 1; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Is the array contains duplicate elements? " + checkDuplicatesInArray(new int[]{1,2,3,2,5}));
        System.out.println("Is the array contains duplicate elements? " + checkDuplicatesInArray(new int[]{1,2,3,4,5}));
    }
}
