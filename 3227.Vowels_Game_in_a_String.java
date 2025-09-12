class Solution {
    public boolean doesAliceWin(String s) {
        int vowels = 0;
        for (char c : s.toCharArray()) 
            if ("aeiou".indexOf(c) >= 0) vowels++;
        
        // If no vowels, Alice cannot move → Bob wins
        if (vowels == 0) return false;
        
        // If there is at least 1 vowel, Alice always has a winning strategy
        return true;
    }
}