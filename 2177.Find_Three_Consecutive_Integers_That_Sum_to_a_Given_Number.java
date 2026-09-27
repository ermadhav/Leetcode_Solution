class Solution {
    public long[] sumOfThree(long num) {
        // to store the ans
        long[] arr = new long[3];
        // if num is not divisible by 3 return empty array
        if(num % 3!=0){
            return new long[0];
        }
        // if divisible by by three get the number divisible by three and the 
        long x = num/3;
        // prev no. of x is the one of the ans
        arr[0] = x-1;
        // x is the ans
        arr[1] = x;
        // next no. of x is the one of the ans
        arr[2] = x+1;
        return arr;
    }
}