class Solution {
    public boolean checkTree(TreeNode root) {
        // Ye to Aana Hi chahiye 
        if(root.val == root.right.val + root.left.val) return true;
        return false;
    }
}