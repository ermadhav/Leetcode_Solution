class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();

        for(char c: s.toCharArray()){
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == c){
                int count = countStack.pop()+1;
                if(count == k){
                    sb.delete(sb.length()-k+1, sb.length());
                }else{
                    sb.append(c);
                    countStack.push(count);
                }
            }else{
                sb.append(c);
                countStack.push(1);
            }
        }
        return sb.toString();
    }
}