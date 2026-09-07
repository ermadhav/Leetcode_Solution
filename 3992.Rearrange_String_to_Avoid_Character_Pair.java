class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c==y){
                ans.append(c);
            }
        }
        for(char c: s.toCharArray()){
            if(c != x && c != y) ans.append(c);
        }
        for(char c: s.toCharArray()){
            if(c==x){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}