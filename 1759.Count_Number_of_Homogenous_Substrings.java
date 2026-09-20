class Solution {
    public int countHomogenous(String s) {
        long ans=0;
        long count =0;
        int mod =1000000007;
        for(int i=0; i<s.length(); i++){
            // if same char occurs incrs count
            if(i>0 && s.charAt(i) == s.charAt(i-1)){
                count++;
                // else reset the count
            }else{
                count =1;
            }
            // add all substring ending at i
            ans += count;
            ans %= mod;
        }
        return (int)ans;
    }
}