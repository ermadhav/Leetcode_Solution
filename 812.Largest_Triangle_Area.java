class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;

        // Loop through all combinations of 3 different points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    // Calculate the area of the triangle formed by points i, j, k
                    // and update maxArea if it's larger than the current maxArea
                    maxArea = Math.max(maxArea, area(points[i], points[j], points[k]));
                }
            }
        }

        return maxArea; // Return the largest area found
    }

    // Helper method to calculate triangle area using the Shoelace formula
    private static double area(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(
                a[0] * (b[1] - c[1]) + // x1(y2 - y3)
                b[0] * (c[1] - a[1]) + // x2(y3 - y1)
                c[0] * (a[1] - b[1]) // x3(y1 - y2)
        );
    }
}