class Solution {
    public boolean checkTree(TreeNode root) {
        // Leetcode Prob No:- 2236
        // Ye to Aana Hi chahiye
        if(root.val == root.right.val + root.left.val) return true;
        return false;
    }
}