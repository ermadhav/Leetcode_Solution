class Solution {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // Step 1: fill both lists using inorder traversal
        inorder(root1, l1);
        inorder(root2, l2);

        // Step 2: merge both sorted lists
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                result.add(l1.get(i++));
            } else {
                result.add(l2.get(j++));
            }
        }

        while (i < l1.size()) result.add(l1.get(i++));
        while (j < l2.size()) result.add(l2.get(j++));

        return result;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}