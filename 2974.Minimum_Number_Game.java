class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums); // sort nums so we can take min easily
        int n = nums.length;
        int[] arr = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i += 2) {
            int alice = nums[i];     // Alice picks min
            int bob = nums[i + 1];   // Bob picks next min
            arr[idx++] = bob;        // Bob appends first
            arr[idx++] = alice;      // then Alice appends
        }
        return arr;
    }
}