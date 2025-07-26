class Solution {
    public int maxScore(String s) {
        int max =0;
        int zeros =0;
        int ones =0;
        for(char c : s.toCharArray()){
            if(c == '1') ones++;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0') zeros++;
            else ones--;
            max = Math.max(max, zeros+ones);
        }
        return max;
    }
}