package intermediate;

import java.util.HashMap;
import java.util.Map;

public class TwoSumElementsMapOptimized {
    /**
     * Optimized TwoSum solution using HashMap.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        if (nums == null || nums.length < 2){
            return null;
        }
        for (int i=0; i < nums.length; i++){
            int current = nums[i];
            int needed = target - current;
            if (map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }
            map.put(current, i );
         }
        return null;
        }

    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 15};
        int[] result = twoSum(nums, 6);

        if (result != null) {
            System.out.println(result[0] + ", " + result[1]);
        }
    }
    }




