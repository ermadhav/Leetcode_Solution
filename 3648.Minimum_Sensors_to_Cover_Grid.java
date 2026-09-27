class Solution {
    public int minSensors(int n, int m, int k) {
        // single sensor covers this much cells
        int size =2*k+1;
        // sensor needed to cover rows
        int rows =(n+size-1)/size;
        // sensor needed to cover rows
        int cols =(m+size-1)/size;
        return rows*cols;
    }
}