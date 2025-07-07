class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();       // store elements from nums1
        HashSet<Integer> result = new HashSet<>();    // store intersection elements
        
        // Add all nums1 elements to set
        for (int num : nums1) {
            set.add(num);
        }
        
        // Check nums2 elements, add to result if in set
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
                set.remove(nums2[i]);  // avoid duplicates
            }
        }
        
        // Convert result set to array
        int[] ans = new int[result.size()];
        int index = 0;
        for (int num : result) {
            ans[index++] = num;
        }
        
        return ans;   // return intersection array
    }
}
