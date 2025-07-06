import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of digit sums
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Find max group size
        int max = 0;
        for (int val : map.values()) {
            if (val > max) max = val;
        }

        // Count how many groups have max size
        int count = 0;
        for (int val : map.values()) {
            if (val == max) count++;
        }

        return count;
    }

    // Helper method to calculate digit sum
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
