class Solution {
    public String decodeMessage(String key, String message) {
        char[] map=new char[26];
        char ch ='a';
        for(char c:key.toCharArray()){
            if(c != ' ' && map[c - 'a'] == 0){
                map[c-'a']=ch;
                ch++;
            }
        }
        String ans="";
        for(char c:message.toCharArray()){
            if(c == ' '){
                ans +=' ';
            }else{
                ans +=map[c-'a'];
            }
        }
        return ans;
    }
}