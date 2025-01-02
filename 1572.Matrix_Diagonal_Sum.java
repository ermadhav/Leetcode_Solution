class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarySum = 0;
        int secondarySum = 0;

        for(int i =0; i < n; i++){
            primarySum += mat[i][i];
            secondarySum += mat[i][n-1-i];
        }

        if(n % 2 != 0){
            int centerElement = mat[n/2][n/2];
            primarySum -= centerElement; 
        }
        return primarySum + secondarySum;
    }
}