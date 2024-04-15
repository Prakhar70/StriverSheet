package Day_2_Array;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i=0;i<nums.length;i++){
            int ele = nums[i]>=0?nums[i]:-nums[i];
            if (nums[ele] >= 0){
                nums[ele]=-nums[ele];
            }else{
                return ele;
            }
        }
        return -1;
    }
}
