import java.util.HashSet;

class Solution {
    public int[] countMatches(int[] nums1, int[] nums2) {
        // Store unique elements of nums1 and nums2
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        int answer1 = 0;
        // Count nums1 elements present in nums2
        for (int num : nums1) {
            if (set2.contains(num)) answer1++;
        }

        int answer2 = 0;
        // Count nums2 elements present in nums1
        for (int num : nums2) {
            if (set1.contains(num)) answer2++;
        }

        // Return both counts
        return new int[]{answer1, answer2};
    }
}
