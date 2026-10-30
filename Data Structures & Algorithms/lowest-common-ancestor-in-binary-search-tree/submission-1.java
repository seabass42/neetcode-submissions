/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (contains(root.left, p) && contains(root.left, q)) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (contains(root.right, p) && contains(root.right, q)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
        
    }

    private boolean contains(TreeNode root, TreeNode p) {
        if (root == null) return false;

        return root.val == p.val || contains(root.left, p) || contains(root.right, p);
    }
}
