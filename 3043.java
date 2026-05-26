class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        char target = (char) (digit + '0');

        for (int num : nums) {
            String str = String.valueOf(num);

            for (char ch : str.toCharArray()) {
                if (ch == target) {
                    count++;
                }
            }
        }

        return count;

    }
}