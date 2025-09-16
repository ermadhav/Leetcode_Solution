class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        
        // Loop through each query
        for (int i = 0; i < l.length; i++) {
            // Extract subarray from nums using range [l[i], r[i]]
            int[] sub = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            
            // Sort the subarray (since rearrangement is allowed)
            Arrays.sort(sub);
            
            // Find the common difference using first two elements
            int diff = sub[1] - sub[0];
            boolean ok = true;
            
            // Check if all consecutive differences are equal
            for (int j = 2; j < sub.length; j++) {
                if (sub[j] - sub[j - 1] != diff) {
                    ok = false; // Not arithmetic
                    break;
                }
            }
            
            // Store result for this query
            ans.add(ok);
        }
        
        return ans; // Return final list of answers
    }
}