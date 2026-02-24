class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0; // stores total beautiful pairs

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (a >= 10) a /= 10;   // get first digit of nums[i]

            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j] % 10;  // get last digit of nums[j]

                if (gcd(a, b) == 1)    // check if digits are coprime
                    count++;           // increase count if beautiful
            }
        }
        return count; // return total pairs
    }

    int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y); // find GCD using recursion
    }
}