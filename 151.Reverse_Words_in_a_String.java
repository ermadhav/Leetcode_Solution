class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the words array
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Step 3: Join words with a single space
        return String.join(" ", words);
    }
}
