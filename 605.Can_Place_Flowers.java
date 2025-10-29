class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check left and right neighbors
                int left = (i == 0) ? 0 : flowerbed[i - 1];
                int right = (i == len - 1) ? 0 : flowerbed[i + 1];

                if (left == 0 && right == 0) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    count++;

                    // If we already planted enough, return true
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}