import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Step 1: Sort by starting point ascending, and ending point descending
        Arrays.sort(intervals, (a, b) -> 
            a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]
        );

        int count = 0;
        int end = 0;

        // Step 2: Go through each interval
        for (int[] interval : intervals) {
            if (interval[1] > end) {
                count++;
                end = interval[1];
            }
            // else, it is covered so we skip
        }

        return count;
    }
}
