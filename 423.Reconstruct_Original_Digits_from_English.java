class Solution {
    public String originalDigits(String s) {
        int[] count = new int[26]; // Count of each letter a-z

        // Count frequency of each character in the input string
        for (char c : s.toCharArray()) 
            count[c - 'a']++;

        int[] digit = new int[10]; // To store count of each digit from 0 to 9

        // Use unique letters to identify certain digits
        digit[0] = count['z' - 'a']; // 'z' is only in "zero"
        digit[2] = count['w' - 'a']; // 'w' is only in "two"
        digit[4] = count['u' - 'a']; // 'u' is only in "four"
        digit[6] = count['x' - 'a']; // 'x' is only in "six"
        digit[8] = count['g' - 'a']; // 'g' is only in "eight"

        // Handle digits with overlapping letters
        digit[3] = count['h' - 'a'] - digit[8];             // "three" has 'h', but so does "eight"
        digit[5] = count['f' - 'a'] - digit[4];             // "five" has 'f', but so does "four"
        digit[7] = count['s' - 'a'] - digit[6];             // "seven" has 's', but so does "six"
        digit[1] = count['o' - 'a'] - digit[0] - digit[2] - digit[4]; // "one" has 'o', shared with "zero", "two", "four"
        digit[9] = count['i' - 'a'] - digit[5] - digit[6] - digit[8]; // "nine" has 'i', shared with "five", "six", "eight"

        // Build the final result string in sorted order
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++)
            while (digit[i]-- > 0) 
                sb.append(i);

        return sb.toString(); // Return the digits in ascending order
    }
}
