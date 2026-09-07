class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();

        // first add all occurrences of y
        for(char c: s.toCharArray()){
            if(c==y){
                ans.append(c);
            }
        }
        // then add all occurence except x and y
        for(char c: s.toCharArray()){
            if(c != x && c != y) ans.append(c);
        }
        // first add all occurrences of x
        for(char c: s.toCharArray()){
            if(c==x){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}