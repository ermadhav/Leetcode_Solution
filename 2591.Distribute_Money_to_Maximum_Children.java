class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;

        money -= children;                    // give each child $1
        int ans = Math.min(money / 7, children);

        money -= ans * 7;
        children -= ans;

        // If no children left but money still remains → invalid → reduce one 8-dollar child
        if (children == 0 && money > 0) ans--;

        // Avoid giving exactly $4 to one child
        if (children == 1 && money == 3) ans--;

        return ans;
    }
}
