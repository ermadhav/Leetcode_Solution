class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxBySpace = n * n;                 // Max containers by deck space
        int maxByWeight = maxWeight / w;        // Max containers by weight
        return Math.min(maxBySpace, maxByWeight); // Return the smaller of the two
    }
}