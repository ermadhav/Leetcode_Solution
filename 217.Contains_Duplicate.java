import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set to store numbers we've seen
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If number is already in set, it's a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Add number to set
            seen.add(num);
        }
        
        // No duplicates found
        return false;
    }
}
