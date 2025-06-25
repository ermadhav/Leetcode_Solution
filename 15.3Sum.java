import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n); // Sort the array to use two-pointer approach
        List<List<Integer>> r = new ArrayList<>();
        
        for (int i = 0; i < n.length - 2; i++) {
            if (i > 0 && n[i] == n[i - 1]) continue; // Skip duplicate values for the first element
            
            // Initialize two pointers
            for (int l = i + 1, rgt = n.length - 1; l < rgt; ) {
                int sum = n[i] + n[l] + n[rgt];
                
                if (sum == 0) {
                    // Triplet found
                    r.add(Arrays.asList(n[i], n[l++], n[rgt--]));
                    
                    // Skip duplicates for the second and third elements
                    while (l < rgt && n[l] == n[l - 1]) l++;
                    while (l < rgt && n[rgt] == n[rgt + 1]) rgt--;
                } else if (sum < 0) {
                    l++; // Need a larger sum, move left pointer to the right
                } else {
                    rgt--; // Need a smaller sum, move right pointer to the left
                }
            }
        }
        
        return r;
    }
}
