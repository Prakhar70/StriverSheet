package Day_2_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge (int[][] intervals){//approach-1

        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int se=-1, ee=-1;
        for (int[] arr:intervals){
            if (se==-1 && ee ==-1){
                se=arr[0];
                ee=arr[1];
                continue;
            }
            if (arr[0]<=ee){
                ee=Math.max(arr[1], ee);
                
            }
            else{
                int[] sub_arr=new int[2];
                sub_arr[0]=se;
                sub_arr[1]=ee;
                list.add(sub_arr);
                se=arr[0];
                ee=arr[1];
            }

        }
        if (se!=-1){
            int[] sub_arr=new int[2];
            sub_arr[0]=se;
            sub_arr[1]=ee;
            list.add(sub_arr);
        }
        return list.toArray(new int[list.size()][]);
    }
    public int[][] merge2(int[][] intervals) {//approach-2
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        
        for (int[] interval:intervals){
            if (list.size()==0){
                
                list.add(interval);
                continue;
            }
            int[] last_ele=list.getLast();
            if (last_ele[1]>=interval[0]){
                last_ele[1]=Math.max(last_ele[1],interval[1]);
            }else{
                list.add(interval);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
