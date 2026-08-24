class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for(char c: s.toCharArray()){
            if(!seen[c-'a']){
                seen[c-'a'] = true;
                count++;
            }
        }
        return count;
    }
}