import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        // Create a set with elements from the first array
        Set<Integer> set = new HashSet<>();
        for (int n : nums[0])
            set.add(n);

        // For each next array, keep only common elements
        for (int i = 1; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int n : nums[i])
                if (set.contains(n))
                    temp.add(n); // Add to temp if element is in both sets
            set = temp; // Update set with intersection result
        }

        // Convert set to list and sort it
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result; // Return sorted intersection
    }
}
