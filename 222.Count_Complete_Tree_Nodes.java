class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0; // empty tree

        int leftHeight = getLeftHeight(root);   // height from left side
        int rightHeight = getRightHeight(root); // height from right side

        // if heights are same, tree is perfect: nodes = 2^h - 1
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }

        // else, count root + left subtree + right subtree
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // height by going left
    private int getLeftHeight(TreeNode node) {
        int h = 0;
        while (node != null) {
            h++;
            node = node.left;
        }
        return h;
    }

    // height by going right
    private int getRightHeight(TreeNode node) {
        int h = 0;
        while (node != null) {
            h++;
            node = node.right;
        }
        return h;
    }
}