class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch: word.toCharArray()){
            set.add(ch);
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(set.contains(ch) && set.contains(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}