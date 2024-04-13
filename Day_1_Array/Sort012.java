package Day_1_Array;

public class Sort012 {
    public void swap(int[] nums,int idx1,int idx2){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
    public void sortColors(int[] nums) {
        int lo=0, n=nums.length;
        int hi=n-1;
        int i=0;
        while (i<=hi){
            if(nums[i]==0){
                swap(nums, i, lo);
                i++;
                lo++;
            }else if (nums[i]==1){
                i++;
            }else {
                swap (nums, i, hi);
                hi--;
            }
        }
    }
}
