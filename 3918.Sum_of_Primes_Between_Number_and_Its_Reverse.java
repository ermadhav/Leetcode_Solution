class Solution {
    public int sumOfPrimesInRange(int n) {
        int num =n;
        int reverse =0;

        // reverse the n
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+n%10;
            n /= 10;
        }
        
        int ans =0;

        // used to create the range 
        int start = Math.min(num, reverse);
        int end = Math.max(num, reverse);

        // checnking every no in the rane 
        for(int i=start; i<=end; i++){
            
            // assuming no. is prime
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