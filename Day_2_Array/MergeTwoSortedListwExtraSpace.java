package Day_2_Array;

import java.util.Arrays;

public class MergeTwoSortedListwExtraSpace {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){//approach -1;
        // Write your code here.
      int a_len = a.length;
      int b_len  = b.length;
      int i=a_len-1;
      int j=0;
      while (j<b_len && i>=0 ){
          if (a[i]<b[j]){
              break;
          }else{
              long temp=a[i];
              a[i]=b[j];
              b[j]=temp;
          }
          i--;j++;
      }
      Arrays.sort(a);
      Arrays.sort(b);
  }
}
