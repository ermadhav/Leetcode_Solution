class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int ans = -1;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(n-i-1)){
                ans =i;
                break;
            }
        }
        
        return ans;
    }
}