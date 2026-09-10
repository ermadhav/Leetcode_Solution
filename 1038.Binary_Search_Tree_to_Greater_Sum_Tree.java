class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return null;

        // traverse right first (greater elemeents)
        bstToGst(root.right);
        sum += root.val;
        root.val = sum;

        // traverse right first (greater elemeents)
        bstToGst(root.left);
        return root;
    }
}