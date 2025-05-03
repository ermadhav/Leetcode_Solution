class Solution {
    public void reverseString(char[] s) {
        // Initialize pointers at the beginning (left) and end (right) of the array
        int left = 0;
        int right = s.length - 1;
        
        // Continue swapping until the left pointer is less than the right pointer
        while (left < right) {
            // Swap the characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
        
        // Print the reversed array
        for (char ans : s) {
            System.out.println(ans + " ");
        }
    }
}
