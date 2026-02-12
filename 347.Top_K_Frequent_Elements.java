class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Store frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Min-heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> freq.get(a) - freq.get(b));

        // Keep only top k frequent elements in heap
        for (int n : freq.keySet()) {
            pq.add(n);
            if (pq.size() > k)
                pq.poll(); // remove least frequent
        }

        // Store result from heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll();
        }

        return result;
    }
}
