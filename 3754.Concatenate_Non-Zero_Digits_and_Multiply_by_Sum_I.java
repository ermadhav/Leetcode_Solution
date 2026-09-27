class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        String num ="";
        // extracting each digit from num
        while(n>0){
            // get the last digit from num
            int digit = n%10; 
            // remove the last digit from num
            n = n/10;

            if(digit != 0){
                // add digit to num in start for correct order
                num = ""+digit+num;
                sum += digit;
            }
        }
        return Long.parseLong(num)*sum;
    }
}