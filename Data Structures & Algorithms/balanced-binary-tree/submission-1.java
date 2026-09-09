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
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        ans = true;
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root){
        if (root == null) return 0;

        int num1 = dfs(root.left);
        int num2 = dfs(root.right);
        if (Math.abs(num1 - num2) > 1) ans = false;

        return 1 + Math.max(num1, num2);
    }
}
