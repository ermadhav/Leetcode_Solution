class Solution {

    // Returns height if balanced, else -1
    int check(TreeNode root) {
        if (root == null) return 0;

        int left = check(root.left);
        int right = check(root.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

    // True if tree is height-balanced
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
}
