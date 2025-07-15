class Solution {
    public boolean isBoomerang(int[][] points) {
        // Compute 2 * area of triangle formed by the 3 points using the shoelace formula
        int area = p[0][0] * (p[1][1] - p[2][1]) +   // x1 * (y2 - y3)
                   p[1][0] * (p[2][1] - p[0][1]) +   // x2 * (y3 - y1)
                   p[2][0] * (p[0][1] - p[1][1]);    // x3 * (y1 - y2)

        // If the area is not zero, the points are not colinear ⇒ it's a boomerang
        return area != 0;
    }
}