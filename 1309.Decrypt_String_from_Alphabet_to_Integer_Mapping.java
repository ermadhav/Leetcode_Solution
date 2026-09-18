class Solution {
    public String freqAlphabets(String s) {
        String ans = "";
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                n = Integer.parseInt(s.substring(i-2, i));
                i -=2;
            }else{
                n = s.charAt(i)-'0';
            }
            ans += (char)('a'+n-1);
        }
        return new StringBuilder(ans).reverse().toString();
    }
}