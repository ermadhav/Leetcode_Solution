class Solution {
    public int sumOfPrimesInRange(int n) {
        int num =n;
        int reverse =0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+n%10;
            n /= 10;
        }
        int ans =0;
        int start = Math.min(num, reverse);
        int end = Math.max(num, reverse);
        
        for(int i=start; i<=end; i++){
            boolean prime =true;
            if(i<2) continue;
            for(int j=2; j*j <=i; j++){
                if(i%j == 0){
                    prime = false;
                
                }
            }
            if(prime){
                ans += i;
            }
        }
        return ans;
    }
}