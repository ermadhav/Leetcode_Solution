class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        
        for (int i = 0; i < n; i++) {
            int size = result.size();
            // Reflect the current list
            for (int j = size - 1; j >= 0; j--) {
                // Set the i-th bit
                result.add(result.get(j) | (1 << i));
            }
        }
        return result;
    }
}