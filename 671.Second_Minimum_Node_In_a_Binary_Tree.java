class Solution {

    long secondMin = Long.MAX_VALUE;
    int min;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(root.val > min && root.val < secondMin){
            secondMin = root.val;
        }
        inorder(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        inorder(root);
        return secondMin == Long.MAX_VALUE ? -1 : (int)secondMin;
    }
}