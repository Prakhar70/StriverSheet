package Day_2_Array;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        for (int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for (int j=0;j<m/2;j++){
            for (int i=0;i<n;i++){
                
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
    }
}
