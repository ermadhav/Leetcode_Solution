class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); // To store unique characters in the current window
        int left = 0, max = 0; // 'left' is the start of the window, 'max' stores the result

        // Loop through each character with the 'right' pointer
        for (int right = 0; right < s.length(); right++) {

            // If character at 'right' is already in the set, shrink the window from the
            // left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Remove from set
                left++; // Move left pointer to the right
            }

            // Add current character to the set
            set.add(s.charAt(right));

            // Update max length if this window is larger
            max = Math.max(max, right - left + 1);
        }

        return max; // Return the length of the longest substring without repeating characters
    }
}