class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        int index = 0;

        // Store all matrix cells
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[index][0] = r;
                result[index][1] = c;
                index++;
            }
        }

        // Sort by Manhattan distance
        java.util.Arrays.sort(result, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return distA - distB;
        });

        return result;
    }
}
