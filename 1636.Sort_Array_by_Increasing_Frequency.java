import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Convert array to Integer[] for custom sorting
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Custom sorting rule
        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);

            if (freqA != freqB) {
                return freqA - freqB;  // increasing order of frequency
            } else {
                return b - a;          // decreasing order of value
            }
        });

        // Convert back to int[]
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,2,2,2,3};
        int[] result = sol.frequencySort(nums);

        System.out.println(Arrays.toString(result));
    }
}
