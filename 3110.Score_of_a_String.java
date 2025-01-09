class Solution {
    public int scoreOfString(String s) {
        int sum =0;

        //Interating through the String
        for(int i=1; i<s.length(); i++){
            sum += Math.abs(s.charAt(i-1)-s.charAt(i));


        }
        return sum;
    }
}