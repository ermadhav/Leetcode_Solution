class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]); // horizontal distance
            int dy = Math.abs(points[i][1] - points[i - 1][1]); // vertical distance
            time += Math.max(dx, dy); // add max distance (diagonal moves count)
        }
        return time;
    }
}
