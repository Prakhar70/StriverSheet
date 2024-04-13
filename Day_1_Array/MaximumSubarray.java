package Day_1_Array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        int n=nums.length;
        int sub_ans=0;
        int ans= -(int)1e4;
        for (int i=0;i<n;i++){
            
            int choice1= sub_ans+nums[i];
            int choice2= nums[i];
            sub_ans = Math.max (choice1, choice2);
            ans = Math.max(ans, sub_ans);
            
        }
        return ans;
    }
}
