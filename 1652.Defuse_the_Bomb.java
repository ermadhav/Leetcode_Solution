class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        // If k is 0, all values remain 0
        if (k == 0) return res;

        // For each index, calculate sum of next/previous k elements
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 1; j <= Math.abs(k); j++) {
                if (k > 0)
                    sum += code[(i + j) % n];      // take next elements (circular)
                else
                    sum += code[(i - j + n) % n];  // take previous elements (circular)
            }

            res[i] = sum;  // store decrypted value
        }

        return res;
    }
}
