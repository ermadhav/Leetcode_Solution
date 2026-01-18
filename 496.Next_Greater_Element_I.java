class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Map to store next greater element for each number in nums2
        Map<Integer, Integer> map = new HashMap<>();

        // Stack to keep elements in decreasing order
        Stack<Integer> stack = new Stack<>();

        // Find next greater for each element in nums2
        for (int n : nums2) {
            while (!stack.isEmpty() && n > stack.peek()) {
                map.put(stack.pop(), n); // current n is next greater
            }
            stack.push(n);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build answer for nums1 using the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
