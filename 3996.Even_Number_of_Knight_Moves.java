class Solution {
    public boolean canReach(int[] start, int[] target) {
        // checking if both cells have the same color
        return (start[0]+start[1])%2 == (target[0]+target[1])%2;
    }
}