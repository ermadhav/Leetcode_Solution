class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxBySpace = n * n; 
        int maxByWeight = maxWeight / w; 
        return Math.min(maxBySpace, maxByWeight);
    }
}