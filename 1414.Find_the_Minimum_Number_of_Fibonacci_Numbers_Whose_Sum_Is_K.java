class Solution {
    public int findMinFibonacciNumbers(int k) {
        int a =1;
        int b =1;
        int count =0;
        while(b <= k){
            int temp = a+b;
            a = b;
            b = temp;
        }
        while(k>0){
            if(a <= k){
                k -= a;
                count++;
            }else{
                int temp = b-a;
                b = a;
                a = temp;
            }
        }
        return count;
    }
}