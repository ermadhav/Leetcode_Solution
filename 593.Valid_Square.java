import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] pts = {p1, p2, p3, p4};
        Set<Integer> set = new HashSet<>();

        // Calculate all pairwise distances
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++) {
                int d = dist(pts[i], pts[j]);
                if (d == 0) return false;  // Overlapping points
                set.add(d);
            }

        // Valid square has exactly 2 distinct distances (side & diagonal)
        return set.size() == 2;
    }

    // Calculate squared distance between two points
    private static int dist(int[] a, int[] b) {
        int dx = a[0] - b[0], dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
}
