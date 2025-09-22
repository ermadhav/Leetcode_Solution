class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        // Find the maximum frequency
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int result = 0;
        // Sum frequencies of all numbers with max frequency
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                result += freq;
            }
        }

        return result;
    }
}