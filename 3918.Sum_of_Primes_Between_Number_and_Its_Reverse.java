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

            // check if i has any divisor from 2 to sqrt(i)
            for(int j=2; j*j <=i; j++){
                // if i is divisible by j, it is not prime
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            // if prime then add it to sum
            if(prime){
                ans += i;
            }
        }
        return ans;
    }
}