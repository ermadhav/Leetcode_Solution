class Solution {
    public int maximumSum(int[] arr) {
        int curr0 = arr[0]; // no deletion
        int curr1 = 0;      // one deletion used
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr1 = Math.max(curr0, curr1 + arr[i]); // delete current OR keep it
            curr0 = Math.max(arr[i], curr0 + arr[i]); // normal kadane
            ans = Math.max(ans, Math.max(curr0, curr1));
        }

        return ans;
    }
}
