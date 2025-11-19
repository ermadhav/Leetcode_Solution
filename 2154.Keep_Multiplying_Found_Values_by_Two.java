class Solution {
    public int findFinalValue(int[] nums, int original) {

        // keep checking as long as original is found
        boolean found = true;

        while (found) {
            found = false; // reset for each loop

            // scan the array
            for (int num : nums) {
                if (num == original) {
                    original *= 2; // double the value
                    found = true;  // found again, so check once more
                    break;         // restart the check with new value
                }
            }
        }

        // final value not found in array
        return original;
    }
}
