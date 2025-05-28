import java.util.Set;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
int result = 0;
    Set<Integer> seen = new HashSet<>();
    
    for (int num : nums) {
        // If number is already seen once, it means this is the second occurrence (duplicate)
        if (seen.contains(num)) {
            // XOR the duplicate number into result
            result ^= num;
        } else {
            // First time seeing this number, add it to the set
            seen.add(num);
        }
    }
    
    // Return XOR of all numbers that appear twice
    return result;
    }
}