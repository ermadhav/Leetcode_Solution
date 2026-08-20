class Solution {
    public boolean buddyStrings(String s, String goal) {
        int first = -1;
        int second = -1;
        if(s.length() != goal.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(first == -1){
                    first = i;
                }else if(second == -1){
                    second = i;
                }else{
                    return false;
                }
            }
        }
        if(first == -1){
            int[] freq = new int[26];
            for(char ch: s.toCharArray()){
                freq[ch - 'a']++;
                if(freq[ch-'a'] >= 2){
                    return true;
                }
            }
            return false;
        }
        if(second == -1){
            return false;
        }
        boolean ans = s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        return ans;
    }
}