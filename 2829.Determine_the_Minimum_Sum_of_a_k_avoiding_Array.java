class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0, count = 0, num = 1;
        boolean[] used = new boolean[k]; // mark picked numbers < k

        while (count < n) {
            if (num < k && used[k - num]) { // skip if forms sum k
                num++;
                continue;
            }
            sum += num;      // add to sum
            count++;         // count picked
            if (num < k) used[num] = true; // mark as picked
            num++;
        }
        return sum;
    }
}
