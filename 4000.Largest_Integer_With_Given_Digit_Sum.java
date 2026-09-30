class Solution {
    public int largestInteger(int n, int s) {
        // sum will not exceed 9*n
        if(s>9*n){
            return -1;
        }
        StringBuilder ans = new StringBuilder();
        // add max digit first
        while(s>=9){
            ans.append('9');
            s-=9;
        }
        // add remaining sum
        if(s>0){
            ans.append((char)('0'+s));
        }
        // filling remaing place with 0
        while(ans.length()<n){
            ans.append('0');
        }
        return Integer.parseInt(ans.toString());
    }
}