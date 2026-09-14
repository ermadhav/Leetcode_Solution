// class Solution {
//     public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//         // If one rectangle is left of the other, If one rectangle is above the other, no overlap
//         if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0] || rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
//             return false;
//         } else {
//             return true;
//         }
//     }
// }

// Approach ---> 2

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        // get X Coordinate of Rect
        int x1 = rec1[0];
        int x_1 = rec2[0];
        int x2 = rec1[2];
        int x_2 = rec2[2];

        // get Y Coordinate of Rect
        int y1 = rec1[1];
        int y_1 = rec2[1];
        int y2 = rec1[3];
        int y_2 = rec2[3];
        boolean ans = false;

        // checking if there is overlap in x,y
        if(Math.max(x1, x_1)<Math.min(x2, x_2) && Math.max(y1, y_1)<Math.min(y2, y_2)  ){
            ans = true;
        }else{
            ans = false;
        }
        return ans;
    }
}