import java.util.*;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0; // final count of boomerangs
        
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>(); // distance -> count
            
            // Calculate distances from point i to all other points
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue; // skip same point
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int dist = dx * dx + dy * dy; // squared distance
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            
            // For each distance count v, add v*(v-1) to result
            for (int v : map.values())
                res += v * (v - 1);
        }
        
        return res;
    }
}
