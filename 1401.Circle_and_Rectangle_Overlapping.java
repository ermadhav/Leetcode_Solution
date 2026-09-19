class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // closest-X and Y inside the rectangle
        int closestX = Math.max(x1, Math.min(x2, xCenter));
        int closestY = Math.max(y1, Math.min(y2, yCenter));

        diff between center and closestX and Y
        int diffX = xCenter - closestX;
        int diffY = yCenter - closestY;

        if(diffX*diffX+diffY*diffY <= radius*radius) return true;

        return false;
    }
}