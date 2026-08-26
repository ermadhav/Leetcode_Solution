class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0; // l or r ka balnc track karega
        int count = 0; // kitne balance vo 
        for(char c: s.toCharArray()){
            if(c == 'L'){
                balance++;
            }else{
                balance--;
            }

            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}