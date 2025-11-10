class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        // Take first two points
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];

        // Check slope of each point with the first point
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];

            // Use cross multiplication to avoid division (slope comparison)
            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0))
                return false; // If slopes differ, not a straight line
        }

        return true; // All points lie on the same line
    }
}
