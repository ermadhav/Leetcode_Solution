class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n]; // keeps track of which baskets are already taken
        int unplaced = 0; // count of fruits that cannot be placed

        // Try to place each fruit
        for (int i = 0; i < n; i++) {
            boolean placed = false;
            // Look for the first available basket that can hold this fruit
            for (int j = 0; j < n; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true; // mark basket as used
                    placed = true;
                    break; // move to the next fruit
                }
            }
            if (!placed) {
                unplaced++; // fruit could not be placed in any basket
            }
        }
        return unplaced; // return the number of unplaced fruits
    }
}
