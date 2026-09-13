class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans = 0;
        int n = img1.length;

        //try every vertical shift
        for(int down=-(n-1); down<=n-1; down++ ){
            //try every vertical shift
            for(int right=-(n-1); right<=n-1; right++ ){
                int count =0;

                // checking every cell of imgage 1
                for(int row=0; row<n; row++){
                    for(int col=0; col<n; col++){

                        // only move cell which has 1
                        if(img1[row][col] == 1){
                            int newRow= row+down;
                            int newCol= col+right;

                            // Check if moved cell is inside img2
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