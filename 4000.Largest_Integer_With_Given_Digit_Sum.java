class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n){
            return -1;
        }
        StringBuilder ans = new StringBuilder();
        while(s>=9){
            ans.append('9');
            s-=9;
        }
        if(s>0){
            ans.append((char)('0'+s));
        }
        while(ans.length()<n){
            ans.append('0');
        }
        return Integer.parseInt(ans.toString());
    }
}