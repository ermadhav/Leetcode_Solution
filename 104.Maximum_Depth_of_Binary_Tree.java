class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // if tree is empty, depth is 0
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); // depth = 1 + max depth of subtrees
    }
}
