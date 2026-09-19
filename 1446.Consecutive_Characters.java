class Solution {
    public int maxPower(String s) {
        int curr =1; // 1 because string is non empty
        int max =1; // max possible is one because is 1 char is valid
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