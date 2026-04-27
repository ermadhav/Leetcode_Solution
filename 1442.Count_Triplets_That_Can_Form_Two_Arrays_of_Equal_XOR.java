class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int k = i; k < n; k++) {
                xor ^= arr[k];
                if (xor == 0) {
                    count += (k - i);
                }
            }
        }

        return count;
    }
}