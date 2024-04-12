package Day_1_Array;

import java.util.ArrayList;
import java.util.List;

public class pascal {

    public List<List<Integer>> generate(int numRows) {
         
        List<List<Integer>> list = new ArrayList<>();
         
        for (int n=0; n<numRows; n++){
            
            List<Integer> sub_list = new ArrayList<>();
            int ncr=1;
            for (int r=0;r<=n;r++){
                
                sub_list.add (ncr);
                ncr=ncr * (n-r)/(r+1);
            }
            list.add(sub_list);
        }
        return list;
    }
}
