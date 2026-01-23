class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left =0;
        int right = piles.length-1;
        int mycoins =0;
        while(left < right){
            right--;
            mycoins += piles[right];
            right--;
            left++;
        }
        return mycoins;
    }
}