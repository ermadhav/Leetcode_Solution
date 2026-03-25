class Solution {
    public boolean isBalanced(TreeNode root) {
       return check(root)  != -1;
    }

    int check(TreeNode node){
        if(node == null) return 0;

        int lh = check(node.left);
        if(lh == -1) return -1;

        int rh = check(node.right);
        if(rh == -1) return -1;
        
        if(Math.abs(lh-rh) > 1) return -1;
        return Math.max(lh, rh)+1;
    }
}