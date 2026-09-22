class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans =new ArrayList<>();
        StringBuilder s =new StringBuilder();
        for(char ch :target.toCharArray()){
            // key1: append 'a'
            s.append('a');
            ans.add(s.toString());

             // key2: change 'a' to the required char
            for(char c='b'; c<= ch; c++){
                s.setCharAt(s.length()-1,c);
                ans.add(s.toString());
            }
        }
        return ans;
    }
}