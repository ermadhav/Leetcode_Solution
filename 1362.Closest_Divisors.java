class Solution {
    public int[] closestDivisors(int num) {
        int a = num+1;
        int b = num+2;
        for(int i= (int)Math.sqrt(b); i >= 1; i--){
            if(a % i == 0) return new int[]{i, a/i};
            if(b % i == 0) return new int[]{i, b/i};
        }
        return null;
    }
}