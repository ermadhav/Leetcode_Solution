class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int length = end - start + 1;

                if (length % 2 == 1) {
                    int sum = 0;
                    for (int i = start; i <= end; i++) {
                        sum += arr[i];
                    }
                    total += sum;
                }
            }
        }

        return total;
    }
}