class Solution {

    private int diameter = 0;   // <-- declare diameter

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {   // <-- fix class name
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);

        diameter = Math.max(diameter, left + right); // update diameter
        return Math.max(left, right) + 1;
    }
}