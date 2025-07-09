class Solution {
    public int minSwaps(String s) {
        int balance = 0, maxImbalance = 0;

        for (char c : s.toCharArray()) {
            balance += c == '[' ? 1 : -1;
            if (balance < 0)
                maxImbalance = Math.max(maxImbalance, -balance);
        }

        return (maxImbalance + 1) / 2;
    }
}