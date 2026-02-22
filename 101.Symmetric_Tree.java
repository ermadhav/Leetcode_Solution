class Solution {
    public boolean isSymmetric(TreeNode root) {
        // If tree is empty, it is symmetric
        if(root == null) return true;
        
        // Check if left and right subtree are mirror of each other
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2){
        // Both nodes are null → symmetric
        if(t1 == null && t2 == null) return true;
        
        // One is null and other is not → not symmetric
        if(t1 == null || t2 == null) return false;
        
        // Check values and mirror structure recursively
        return (t1.val == t2.val) &&
                isMirror(t1.left, t2.right) &&
                isMirror(t1.right, t2.left);
    }
}