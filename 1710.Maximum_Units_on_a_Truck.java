import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort box types by units per box in descending order
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int units = 0; // total units loaded onto the truck

        // Go through each type of box
        for (int[] box : boxTypes) {
            // Decide how many boxes of this type to take
            int take = Math.min(truckSize, box[0]);

            // Add their units to total
            units += take * box[1];

            // Reduce truck space
            truckSize -= take;

            // If truck is full, stop
            if (truckSize == 0) break;
        }

        return units; // return max total units
    }
}
