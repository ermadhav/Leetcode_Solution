class Solution {
    public int maxPower(String s) {
        int curr =1; 
        int max =1; // 
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                curr++; // if found then incrs the curr
            }else{
                curr = 1; // if not then reset
            }
            // the longest found till now
            max = Math.max(curr, max);
        }
        return max;
    }
}