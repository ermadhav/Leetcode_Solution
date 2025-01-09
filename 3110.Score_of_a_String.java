class Solution {
    public int scoreOfString(String s) {
        // int l=s.length;
        int sum =0;
        for(int i=1; i<s.length(); i++){
            sum += Math.abs(s.charAt(i-1)-s.charAt(i));


        }
        return sum;
    }
}