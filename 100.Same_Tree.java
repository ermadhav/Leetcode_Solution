class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (!p || !q) return p == q;       // both null or one null
        if (p->val != q->val) return false; // value mismatch
        return isSameTree(p->left, q->left) // check left
            && isSameTree(p->right, q->right); // check right
    }
};
