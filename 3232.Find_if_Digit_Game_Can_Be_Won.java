class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0; // sum of single-digit numbers
        int doubleSum = 0; // sum of double-digit numbers

        for (int num : nums) {
            if (num < 10) {
                singleSum += num;
            } else if (num < 100) {
                doubleSum += num;
            }
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Check both options
        if (singleSum > totalSum - singleSum) return true;
        if (doubleSum > totalSum - doubleSum) return true;

        return false; // Alice can't win in either option
    }
}
