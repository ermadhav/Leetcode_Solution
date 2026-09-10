class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return null;

        // traverse right first (greater elemeents)
        bstToGst(root.right);

        // Add current node to sum
        sum += root.val;

        // update curr node with greater tree value
        root.val = sum;

        // traverse right first (greater elemeents)
        bstToGst(root.left);
        return root;
    }
}