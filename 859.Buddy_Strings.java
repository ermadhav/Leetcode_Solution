class Solution {
    public boolean buddyStrings(String s, String goal) {
        int first = -1;
        int second = -1;

        // lengths diff, can never be buddy
        if(s.length() != goal.length()){
            return false;
        }

        // find the index where strings are diff
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){

                // store 1st mismatch
                if(first == -1){
                    first = i;

                // store 2nd mismatch
                }else if(second == -1){
                    second = i;

                // more then two
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