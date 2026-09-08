class Solution {
    public int countCommas(int n) {
        int ans = 0;

        // no comma under 999
        if(n <= 999){
            ans = 0;

        // 1000 se n tak me har me 1 comma hota hai
        }else{
            ans = n-999;
        }
        return ans;
    }
}