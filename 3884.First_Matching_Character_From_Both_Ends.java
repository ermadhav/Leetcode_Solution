class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int ans = -1;
        
        // simple loop 
        for(int i=0; i<s.length(); i++){
            // if first and last char matches return the index
            if(s.charAt(i) == s.charAt(n-i-1)){
                ans =i;
                break; // when found break the loop
            }
        }
        // else ans is -1
        return ans;
    }
}