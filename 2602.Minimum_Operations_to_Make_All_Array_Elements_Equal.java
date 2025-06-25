class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i); // convert number to string
            int len = s.length();

            if (len % 2 != 0) continue; // skip if number of digits is odd

            int half = len / 2, sum1 = 0, sum2 = 0;

            // calculate sum of first and second half
            for (int j = 0; j < half; j++) {
                sum1 += s.charAt(j) - '0';
                sum2 += s.charAt(j + half) - '0';
            }

            if (sum1 == sum2) count++; // check if symmetric
        }
        return count; // return total count
    }
}
