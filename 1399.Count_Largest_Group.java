class Solution {
    public int countLargestGroup(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int max = 0;
        for (int val : map.values()) {
            if (val > max)
                max = val;
        }

        int count = 0;
        for (int val : map.values()) {
            if (val == max)
                count++;
        }

        return count;

    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}