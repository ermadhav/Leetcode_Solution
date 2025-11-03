class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0; // total time to remove balloons
        for (int i = 1; i < colors.length(); i++) {
            // if two adjacent balloons have the same color
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                // remove the one with smaller removal time
                res += Math.min(neededTime[i], neededTime[i - 1]);
                // keep the one with larger removal time
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return res; // return minimum total removal time
    }
}
