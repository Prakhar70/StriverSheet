package Day3_Array;

public class majority2 {
    public int majorityElement(int[] nums) {
        int cnt=1, no=nums[0];
        for (int i=1;i<nums.length; i++){
            
            if (cnt==0){
                cnt=1;
                no=nums[i];
                continue;
            }
            if (nums[i]==no){
                
                cnt++;
            }else{
                
                cnt--;
            }
        }
        return no;
    }
}
