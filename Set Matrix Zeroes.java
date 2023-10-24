class Solution {
    public void setZeroes(int[][] matrix) {
        // Get the number of rows and columns in the matrix.
        int m = matrix.length, n = matrix[0].length;
        
        // Create two arrays to keep track of rows and columns that need to be zeroed.
        int row[] = new int[m];
        int col[] = new int[n];

        // First pass through the matrix to identify which rows and columns contain zeros.
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    // If the current element is zero, mark the corresponding row and column.
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass through the matrix to zero out the marked rows and columns.
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(row[i] == 1 || col[j] == 1){
                    // If the current row or column is marked, set the matrix element to zero.
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
