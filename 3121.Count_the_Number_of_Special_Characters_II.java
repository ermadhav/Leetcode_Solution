class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch = 'a'; ch<= 'z'; ch++){
            if(word.lastIndexOf(ch) < word.indexOf(Character.toUpperCase(ch)) && 
            word.lastIndexOf(ch) != -1 &&
            word.indexOf(Character.toUpperCase(ch)) != -1){
                count++;
            }
        }
        return count;
    }
}