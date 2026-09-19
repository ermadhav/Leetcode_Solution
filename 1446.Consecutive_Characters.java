class Solution {
    public int maxPower(String s) {
        int curr =0;
        int max =0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                curr++;
                max = Math.max(curr, max);
            }else{
                curr = 1;
            }
        }
        return max;
    }
}