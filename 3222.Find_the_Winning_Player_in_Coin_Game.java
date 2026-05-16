class Solution {
    public String winningPlayer(int x, int y) {
        int moves = Math.min(x, y/4);
        return moves%2 == 1 ? "Alice" : "Bob";
    }
}