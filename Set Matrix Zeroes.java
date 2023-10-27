// Tc : O(2*m*n)
// SC : O(m+n)
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






class Solution {
    public void setZeroes(int[][] matrix) {
        // TC : (2*n*m) & SC : O(1) 
        int m = matrix.length , n = matrix[0].length;
        // int col[m] = {0} -> matrix[0][..]
        // int row[n] = {0} -> matrix[..][0]
        int col0 = 1;
       for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                // mark the ith row
                   matrix[i][0] = 0;
                // matrix the jth col
                   if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
               if( matrix[i][j] != 0){
                   // check for col and row
                   if( matrix[i][0] == 0 || matrix[0][j] == 0)  matrix[i][j] = 0;
               }
            }
        }
        if(matrix[0][0] == 0){
            for(int i = 0 ; i < n ; i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0 ; i < m ; i++){
                matrix[i][0] = 0;
            }
        } 
    }
}
