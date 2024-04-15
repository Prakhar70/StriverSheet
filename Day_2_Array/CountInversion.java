package Day_2_Array;

public class CountInversion {
    static int cnt=0;
    public static long getInversions(long arr[], int n) {
        cnt=0;
        mergeSort(arr, 0 , n-1);
        
        return cnt;
    }
    private static long[] mergeSort(long[] arr, int i, int j) {
        if (i==j){
            long[] base= new long[1];
            base[0]=arr[i];
            return base;
        }
        int mid=(i+j)/2;
        long[] arr1=mergeSort(arr, i, mid);
        long[] arr2=mergeSort(arr, mid+1, j);
        
        return mergeSortedArray(arr1, arr2);
        
    }
    
    private static long[] mergeSortedArray(long[] arr1, long[] arr2) {
       
        int n=arr1.length;
        int m=arr2.length;
        long[] res=new long[n+m];
        int k=0,i=0,j=0;
        while (i<n && j<m){
            if (arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
                
                
            }else{
                res[k++]=arr2[j++];
                cnt+=(n-i);
                
            }
        }
        while(i<n){
            res[k++]=arr1[i++];
        }
        while(j<m){
            res[k++]=arr2[j++];
        }
        
        return res;

    }
}
