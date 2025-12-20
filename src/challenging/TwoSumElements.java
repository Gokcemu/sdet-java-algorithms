package challenging;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumElements {
    public int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++){
            int current = nums[i];
            int needed = target - current;
            if (map.containsKey(needed)) {
                return new int[] {map.get(needed)};
            }
            map.put(current, i );
        }
        return null;
        }
    }




