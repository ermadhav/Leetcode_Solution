class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // Sort rows of the matrix based on the k-th column, in descending order
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}