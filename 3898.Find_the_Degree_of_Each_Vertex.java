class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];

        // har vertex ki row
        for(int i=0; i<matrix.length; i++){

            // row ke har element ko 
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] == 1){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}