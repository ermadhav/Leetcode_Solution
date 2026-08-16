class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        // count the char of s
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }

        // count the char of t  
        for(char ch: t.toCharArray()){
            freq[ch - 'a']--;
        }
        int steps = 0;

        for(int count:freq){

            // add the difference ( +ve and -ve )
            steps += Math.abs(count);
        }
        return steps;
    }
}