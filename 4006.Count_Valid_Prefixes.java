class Solution {
    public int countValidPrefixes(String s) {
        int ones =0;
        int zeros =0;
        int ans=0;
        for(int i=0; i<s.length(); i++){
            // count zeros and ones
            if(s.charAt(i) == '0'){
                zeros++;
            }else{
                ones++;
            }
            if(Math.abs(zeros-ones) <= 1){
                ans++;
            }
        }
        
        return ans;
    }
}