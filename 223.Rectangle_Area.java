class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, 
                           int bx1, int by1, int bx2, int by2) {
        
        // Area of first and second rectangle
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        // Overlap width
        int overlapX = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        // Overlap height
        int overlapY = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));

        // Overlap area
        int overlap = overlapX * overlapY;

        // Total area
        return area1 + area2 - overlap;
    }
}
