class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;  // store maximum diagonal length
        int maxArea = 0;         // store area of rectangle with max diagonal
        for(int i=0; i<dimensions.length; i++){
            int l = dimensions[i][0];  // length
            int w = dimensions[i][1];  // width
            double diagonal = Math.sqrt(l*l + w*w); // calculate diagonal
            int area = l * w;                       // calculate area
            if(diagonal > maxDiagonal){             // if new max diagonal found
                maxDiagonal = diagonal;
                maxArea = area;
            } else if(diagonal == maxDiagonal && area > maxArea){ // if diagonal same, pick larger area
                maxArea = area;
            }
        }
        return maxArea; // return area of rectangle with max diagonal
    }
}
