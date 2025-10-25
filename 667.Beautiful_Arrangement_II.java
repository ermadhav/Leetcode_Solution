class Solution {
    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int left = 1, right = n, index = 0;
        
        while (left <= right) {
            // Alternate picking from left/right while k > 0
            if (k > 0) {
                result[index++] = (k % 2 == 1) ? left++ : right--;
                k--;
            } 
            // Fill remaining in ascending order
            else result[index++] = left++;
        }
        return result;
    }
}
