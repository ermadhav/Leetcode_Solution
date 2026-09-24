class Solution {
    public String trimTrailingVowels(String s) {
        int l = s.length()-1;
        // move left while the character is a vowel
        while(l>=0 && "aeiou".indexOf(s.charAt(l)) != -1){
            l--;
        }
        return s.substring(0, l+1);
    }
}