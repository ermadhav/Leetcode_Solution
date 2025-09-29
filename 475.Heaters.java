import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);   // Sort houses
        Arrays.sort(heaters);  // Sort heaters

        int radius = 0;

        for (int house : houses) {
            // Find position of closest heater
            int idx = Arrays.binarySearch(heaters, house);
            if (idx < 0) idx = -idx - 1; // If not found, get insertion point

            // Distance to nearest heater on left and right
            int leftDist = idx - 1 >= 0 ? house - heaters[idx - 1] : Integer.MAX_VALUE;
            int rightDist = idx < heaters.length ? heaters[idx] - house : Integer.MAX_VALUE;

            // Take the closer heater
            int closestDist = Math.min(leftDist, rightDist);

            // Update radius if needed
            radius = Math.max(radius, closestDist);
        }

        return radius;
    }
}
