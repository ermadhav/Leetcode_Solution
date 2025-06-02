class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;      // To count votes
        int candidate = 0;  // Possible majority element

        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Set new candidate
            }
            // Vote for candidate or against it
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;  // This is the majority element
    }
}