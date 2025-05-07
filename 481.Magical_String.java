class Solution {
    public int magicalString(int n) {
        // Edge cases
        if (n <= 0) return 0;
        if (n <= 3) return 1;  // "1 2 2" has only one '1'

        // Create an array to hold the magical string
        int[] s = new int[n + 2]; // +2 to avoid out-of-bounds when appending
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;

        int head = 2;  // Pointer to read counts (how many times to write next number)
        int tail = 3;  // Pointer to position where next number will be written
        int num = 1;   // The next number to write (start with 1 since last was 2)
        int count = 1; // Number of '1's written so far (initially only s[0] is '1')

        // Continue generating the string until we reach n digits
        while (tail < n) {
            int times = s[head]; // How many times to write 'num'
            for (int i = 0; i < times && tail < n; i++) {
                s[tail] = num;   // Write 'num' to the string
                if (num == 1) count++; // If it's a '1', increment count
                tail++;          // Move to next write position
            }
            num = 3 - num; // Alternate between 1 and 2 (1 ↔ 2)
            head++;        // Move to next read position
        }

        return count; // Return number of '1's in the first n digits
    }
}
