class Solution {
    public int findNthDigit(int n) {
        int len =1;
        long count =9, start =1;
        while(n > len*count){
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        long num = start + (n-1)/len;
        return String.valueOf(num).charAt((n-1)% len)-'0';
    }
}