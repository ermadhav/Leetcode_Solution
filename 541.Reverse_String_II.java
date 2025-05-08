class Solution {
    public String reverseStr(String s, int k) {
        // Convert the string to a char array for in-place modifications
        char[] a = s.toCharArray();

        // Loop over the string in increments of 2k
        for (int start = 0; start < a.length; start += 2 * k) {
            // Determine the end index for reversal: up to k characters or end of array
            int i = start;
            int j = Math.min(start + k - 1, a.length - 1);

            // Reverse the first k characters within the current 2k block
            while (i < j) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // Return the modified string
        return new String(a);
    }
}
