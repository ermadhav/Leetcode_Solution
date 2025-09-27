class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap to store frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        // Step 1: Count the occurrences of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect numbers that appear more than n/3 times
        List<Integer> result = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) > n / 3) {
                result.add(key);
            }
        }

        // Step 3: Return the result list
        return result;
    }
}