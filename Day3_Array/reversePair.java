package Day3_Array;

public class reversePair {
    static int cnt=0;
    public int reversePairs(int[] nums) {
        
        mergeSort(nums,0, nums.length-1);
        return cnt;
    }
    private int[] mergeSort(int[] nums,int si, int ei) {
        if (si == ei){
            int[] base=new int[1];
            base[0]=nums[ei];
            return base;
        }
        int mid = (si+ei)/2;
        
        int[] r_ans = mergeSort(nums, si, mid);
        int[] l_ans = mergeSort(nums, mid+1, ei);
        return merge(r_ans, l_ans);
    }
    private int[] merge(int[] r_ans, int[] l_ans) {
        int n=r_ans.length;
        int m=l_ans.length;
        cntReversePair(r_ans, l_ans);
        int [] ans= new int[n+m];
        int i=0,j=0,k=0;
        
        while (i<n && j<m){
            if (l_ans[i]<r_ans[j]){
                ans[k++]=l_ans[i++];
            } else{
                ans[k++]=r_ans[j++];
            }
        }
        while (i<n){
            ans[k++]=r_ans[i++];
        }
        while (j<m){
            ans[k++]=l_ans[i++];
        }
        return ans;
    }
    private void cntReversePair(int[] r_ans, int[] l_ans) {
        int i=0, j=0;
        int n=r_ans.length;
        int m=l_ans.length;
        while (j<n && i<m){
            if(l_ans[i] < 2*r_ans[j]){
                i++;
            }else{
                cnt+=(n-i);
                j++;
            }
        }
    }

}
