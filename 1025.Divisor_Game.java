class Solution {
    public boolean divisorGame(int n) {
        // If n is even, Alice wins; if odd, Alice loses
        return n % 2 == 0;
    }
}