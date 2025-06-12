import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        // Temporary list to store decompressed values
        List<Integer> list = new ArrayList<>();
        
        // Process each pair (frequency, value)
        for(int i = 0; i < nums.length; i += 2) {
            // Add value nums[i+1], nums[i] times
            for(int j = 0; j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
        }

        // Convert list to array
        int[] result = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}
