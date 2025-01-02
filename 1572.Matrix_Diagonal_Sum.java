class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarySum = 0;
        int secondarySum = 0;

        // Iterate through each row
        for(int i =0; i < n; i++){
            primarySum += mat[i][i];
            secondarySum += mat[i][n-1-i];
        }

        if(n % 2 != 0){
            int centerElement = mat[n/2][n/2];
            primarySum -= centerElement;  // Subtract the center element once as it's included in both diagonals
        }
        
        // Return the sum of both diagonals
        return primarySum + secondarySum;
    }
}