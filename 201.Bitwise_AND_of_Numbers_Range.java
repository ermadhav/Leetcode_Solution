class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(left < right){
            right = right & (right -1); // remove rightmost 1 bit
        }
        return right;
    }
}