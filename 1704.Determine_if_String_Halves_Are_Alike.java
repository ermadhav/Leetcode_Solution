class Solution {
    public boolean halvesAreAlike(String s) {
        Boolean ans = false;
        
        // Find the middle of the string
        int mid = s.length() / 2;
        
        // Split the string into two halves
        String first = s.substring(0, mid);
        String second = s.substring(mid);
        
        int count1 = 0;
        int count2 = 0;
        
        // Count vowels in the first half
        for (char c : first.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) count1++;
        }
        
        // Count vowels in the second half
        for (char c : second.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) count2++;
        }

        // Compare the vowel counts
        if (count1 == count2) {
            ans = true;
        }
        
        return ans;
    }
}
