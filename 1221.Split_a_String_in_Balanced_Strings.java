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
            // jab l or r == ho to 1 substring mil gayi
            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}