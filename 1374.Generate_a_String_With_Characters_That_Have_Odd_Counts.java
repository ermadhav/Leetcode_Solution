class Solution {
    public String generateTheString(int n) {
        StringBuilder ans =new StringBuilder();

        // if odd add 'a' just to he answer
        if(n%2 == 1){
            for(int i=0; i<n; i++){
                ans.append('a');
            }
        }else{
            for(int i=0; i<n-1; i++){
                ans.append('a');
            }
            ans.append('b');
        }
        return ans.toString();
    }
}