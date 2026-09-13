class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans = 0;
        int n = img1.length;
        for(int down=-(n-1); down<=n-1; down++ ){
            for(int right=-(n-1); right<=n-1; right++ ){
                int count =0;
                for(int row=0; row<n; row++){
                    for(int col=0; col<n; col++){
                        if(img1[row][col] == 1){
                            int newRow= row+down;
                            int newCol= col+right;
                            if(newRow >= 0 && newRow<n && newCol >= 0 && newCol<n && 
                                img2[newRow][newCol] == 1){
                                    count++;
                            }
                        }
                    }   
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}