package Day4_Array;

import java.util.HashMap;

import java.util.Map;



public class Sum2 {
    public int[] twoSum(int[] nums, int target) {

        int[] ans=new int[2];
        Map<Integer,Integer> set=new HashMap<>();//value , idx
        for (int i=0;i<nums.length;i++){
            if (set.containsKey(target-nums[i])){
                ans[0]=set.get(target-nums[i]);
                ans[1]=i;
            }
            set.put(nums[i],i);
        }
        return ans;
        
    }
}
