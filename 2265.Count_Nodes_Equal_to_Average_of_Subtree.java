// class Solution {
//     int result = 0;
//     public int averageOfSubtree(TreeNode root) {
//         dfs(root);
//         return result;
//     }
//     public int[] dfs(TreeNode node){
//         if (node == null) {
//             return new int[]{0, 0};
//         }

//         int[] left = dfs(node.left);
//         int[] right = dfs(node.right);

//         int totalSum = left[0] + right[0] + node.val;
//         int totalCount = left[1] + right[1] + 1;

//         if(totalSum/ totalCount == node.val){
//             result++;
//         }

//         return new int[]{totalSum, totalCount};

//     }
// }

class Solution {
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
    int[] dfs(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int sum = root.val+left[0]+right[0];
        int count = 1+left[1]+right[1];
        if(root.val == sum/count){
            ans++;
        }
        return new int[]{sum, count};
    }
}