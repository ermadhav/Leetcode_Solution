class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }
    public void postorder(TreeNode node, List<Integer> result){
        if(node == null){
            return;
        }
        
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.val);
    }
}