class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum =0;
        int squareSum =0;
        // extract the digit from the number 1 by 1
        while(n>0){
            int digit = n%10;
            n = n/10;
            // add the digit 1 by 1
            digitSum += digit;
            squareSum += digit*digit;
        }
        if((squareSum - digitSum) >= 50) return true;
        return false;
    }
}