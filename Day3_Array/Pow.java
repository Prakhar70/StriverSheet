package Day3_Array;

public class Pow {
    public double myPow(double x, int n) {
        double ans= myPowPos(x,n);
        if (n<0){
            return 1/ans;
        }
        return ans;
    }
    public double myPowPos(double x, int n){
        if (n==0){
            return 1;
        }
        double ans=myPowPos(x, n/2);
        if (n%2==0){
            return ans*ans;
        }
        return ans*ans*x;
    }
}
