class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // If one rectangle is left of the other, If one rectangle is above the other,
        // no overlap
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        } else {
            return true;
        }
    }
}