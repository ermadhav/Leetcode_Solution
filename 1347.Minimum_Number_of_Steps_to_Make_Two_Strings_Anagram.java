class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        // count the char of s
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }

        // count the char of s  
        for(char ch: t.toCharArray()){
            freq[ch - 'a']--;
        }


        int steps = 0; // count the no. of minimum replacements 

        // T ke missing character ko count karna ( +ve values extra hai s me) 
        for(int count:freq){
            if(count > 0){
                steps += count;
            }
        }
        return steps;
    }
}