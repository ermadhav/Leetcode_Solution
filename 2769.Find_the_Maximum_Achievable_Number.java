class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // The maximum achievable x can be found by increasing x t times
         
        // and simultaneously decreasing num t times. This gives num + 2 * t.
        return num + 2*t;
    }
}