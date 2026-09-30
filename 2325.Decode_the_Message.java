class Solution {
    public String decodeMessage(String key, String message) {
        // store the letters
        char[] map=new char[26];
        // starting from a
        char ch ='a';
        // going through each char of keay
        for(char c:key.toCharArray()){
            // if character is not space and not already mapped
            if(c != ' ' && map[c - 'a'] == 0){
                // map this char to 'a', 'b', etc
                map[c-'a']=ch;
                ch++;
            }
        }
        String ans="";
        // looping through message
        for(char c:message.toCharArray()){
            // keep space as it is
            if(c == ' '){
                ans +=' ';
            }else{
                // replacce char with mapped letter
                ans +=map[c-'a'];
            }
        }
        return ans;
    }
}