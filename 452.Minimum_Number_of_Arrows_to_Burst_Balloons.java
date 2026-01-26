class Solution {
    public int findMinArrowShots(int[][] points) {

        // no balloons
        if (points == null || points.length == 0)
            return 0;

        // sort by end point
        Arrays.sort(points, (a, b) -> {
            if (a[1] == b[1])
                return Integer.compare(a[0], b[0]); // if same end, sort by start
            return Integer.compare(a[1], b[1]);
        });

        int arrows = 1;                 // first arrow
        long arrowPos = points[0][1];   // arrow position

        // check each balloon
        for (int i = 1; i < points.length; i++) {

            // need new arrow
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1]; // move arrow
            }
        }

        return arrows; // result
    }
}
