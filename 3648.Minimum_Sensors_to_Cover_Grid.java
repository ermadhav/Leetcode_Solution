class Solution {
    public int minSensors(int n, int m, int k) {
        int size =2*k+1;
        int rows =(n+size-1)/size;
        int cols =(m+size-1)/size;
        return rows*cols;
    }
}