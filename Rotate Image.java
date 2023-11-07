class Solution {
    public void rotate(int[][] matrix) {

        // Transpose
       for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i+1; j < matrix.length; j++)
            {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp ;
            }   
       }
    // Swap Columns
    int col1 = 0;
    int col2 = matrix.length-1;
    while (col1<col2){
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
        col1++;
        col2--;
    }
       
    }
}





//Method 2

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}