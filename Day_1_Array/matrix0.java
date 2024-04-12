package Day_1_Array;

class matrix0 {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        boolean is_origin_zero = matrix[0][0] == 0 ? true : false;
        boolean is_row_zero = is_origin_zero;
        boolean is_col_zero = is_origin_zero;

        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                is_row_zero = true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                is_col_zero = true;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;

                }
            }
        }

        if (is_row_zero){

            for (int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
        if (is_col_zero){

            for (int j=0;j<n;j++){
                matrix[j][0]=0;
            }
        }
    }
}
