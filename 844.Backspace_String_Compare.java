class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private static String build(String str){
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c != '#'){
                st.push(c);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}