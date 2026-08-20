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

        // strings are already equal
        // We need at least one duplicate character to swap and still keep the string unchanged

        if(first == -1){
            int[] freq = new int[26];
            for(char ch: s.toCharArray()){
                freq[ch - 'a']++;
                if(freq[ch-'a'] >= 2){
                    return true;
                }
            }
            // No duplicate character, so no valid swap is possible
            return false;
        }

        // Only one mismatch cannot be fixed by swapping two characters
        if(second == -1){
            return false;
        }

        // Check whether swapping the two mismatched characters in s will make it equal to goal

        boolean ans = s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        return ans;
    }
}