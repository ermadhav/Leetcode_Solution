class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;          // number of queries
        int[] answer = new int[n];       // result array
        
        for (int j = 0; j < n; j++) {
            int xj = queries[j][0], yj = queries[j][1], rj = queries[j][2];
            int rSquared = rj * rj;      // radius squared
            int count = 0;
            
            for (int[] point : points) {
                int dx = point[0] - xj, dy = point[1] - yj;
                if (dx * dx + dy * dy <= rSquared) count++; // inside circle
            }
            
            answer[j] = count;           // save result
        }
        return answer;
    }
}
