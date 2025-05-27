class Solution {
    public int[] findArray(int[] pref) {
        // Create result array with same size
        int[] ans = new int[pref.length];

        // First number is the same
        ans[0] = pref[0];

        // Find rest of the numbers
        for (int i = 1; i < pref.length; i++) {
            // Current = pref[i] XOR pref[i - 1]
            ans[i] = pref[i] ^ pref[i - 1];
        }

        // Return the final array
        return ans;
    }
}
