package Day4_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {
    //better approach
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> set =new HashSet<>();
            for(int j=i+1;j<n;j++){
                int search_ele=-(nums[i]+nums[j]);
                if (set.contains(search_ele)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],search_ele);
                    temp.sort(null);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}
