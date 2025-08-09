class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length, C[] = new int[n];
        boolean[] seen = new boolean[n + 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            seen[A[i]] ^= true;      // toggle seen for A[i]
            if (!seen[A[i]]) count++; // appeared in both

            seen[B[i]] ^= true;      // toggle seen for B[i]
            if (!seen[B[i]]) count++; // appeared in both

            C[i] = count;            // store result
        }
        return C;
    }
}
