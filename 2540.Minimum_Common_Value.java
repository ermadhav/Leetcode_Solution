import java.util.*;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Store elements of nums1
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        // Find common elements
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]); // Add common element
                set.remove(nums2[i]); // Avoid duplicates
            }
        }

        // Convert set to array
        int[] ans = new int[result.size()];
        int index = 0;
        for(int num : result){
            ans[index++] = num;
        }

        // Sort to get smallest
        Arrays.sort(ans);

        // Return smallest or -1 if none
        return ans.length > 0 ? ans[0] : -1;
    }
}
