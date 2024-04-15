package Day_2_Array;

import java.util.ArrayList;

public class FindRepeatingMissing {
    public static int[] missingAndRepeating(ArrayList<Integer> a, int n) {

        int Sn=n*(n+1)/2;
        int Sn2=n*(n+1)*((2*n)+1)/6;
        int S=0;
        int S2=0;
        for (int i=0;i<n;i++){
            S=S+a.get(i);
            S2=S2+(a.get(i)*a.get(i));

        }
        int diff = Sn-S;
        int sdiff= Sn2-S2;
        int add = sdiff/diff;
        int[] res=new int[2];
        res[0]=(diff+add)/2;
        res[1]=(add-diff)/2;
        return res;
    }
}
