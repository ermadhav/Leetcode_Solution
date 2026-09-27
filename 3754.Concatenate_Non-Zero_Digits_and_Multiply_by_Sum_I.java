class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        String num ="";
        // extracting each digit from num
        while(n>0){
            // get the last digit
            int digit = n%10; 
            n = n/10;
            if(digit != 0){
                num = ""+digit+num;
                sum += digit;
            }
        }
        return Long.parseLong(num)*sum;
    }
}