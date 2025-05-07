class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;  // First 3 digits: "1 2 2" → only one '1'
        
        int[] s = new int[n + 2]; // +2 to avoid index issues
        s[0] = 1;
        s[1] = 2;
        s[2] = 2;

        int head = 2; // pointer to read how many times to write the next number
        int tail = 3; // pointer to the end of the sequence
        int num = 1;  // next number to write (start with 1 since last is 2)
        int count = 1; // '1's count (only s[0] is '1' so far)

        while (tail < n) {
            for (int i = 0; i < s[head]; i++) {
                s[tail] = num;
                if (num == 1 && tail < n) count++;
                tail++;
            }
            num = 3 - num; // toggle between 1 and 2
            head++;
        }

        return count;
    }
}
