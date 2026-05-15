public class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '0'){
                ans.append(ch);
            }
        }
        return Long.parseLong(ans.toString());
    }
}
 {
    
}
