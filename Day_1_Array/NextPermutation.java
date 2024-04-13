package Day_1_Array;

public class NextPermutation {
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int dip_idx=-1;
        for(int i= n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                dip_idx=i-1;
                break;
            }
        }
        if(dip_idx==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i= n-1;i>=0;i--){
            if(nums[i] > nums[dip_idx]){
                swap(nums,i,dip_idx);
                break;
            }
        }
        reverse(nums,dip_idx+1,n-1);
    }

    public void swap(int[] nums,int idx1,int idx2){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
    
    public void reverse(int[] nums,int si,int ei){
        while(si<ei){
            swap(nums,si,ei);
            si++;
            ei--;
        }
    }
}
