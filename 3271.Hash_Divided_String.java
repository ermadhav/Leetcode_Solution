class Solution {
    public String stringHash(String s, int k) {
        String ans = "";

        // taking k char at time
        for(int i=0; i<s.length(); i+=k){
            int value =0;

            // finding sum
            for(int j=i; j<i+k; j++){
                value += s.charAt(j)-'a';
            }

            // value under 0 - 25
            value = value%26;
            char ch = (char)('a'+value);
            ans += ch;
        }
        return ans;
    }
}