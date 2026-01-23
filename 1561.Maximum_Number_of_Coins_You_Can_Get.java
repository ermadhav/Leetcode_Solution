class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int left = 0;
        int right = piles.length - 1;
        int myCoins = 0;

        while (left < right) {
            // Alice takes the largest
            right--;

            // You take the second largest
            myCoins += piles[right];
            right--;

            // Bob takes the smallest
            left++;
        }

        return myCoins;
    }
}