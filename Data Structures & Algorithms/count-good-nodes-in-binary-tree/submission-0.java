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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        return dfs(root, root.val); 
    }

    private int dfs(TreeNode root, int currMax) {
        if (root == null) return 0;
        int curr = 0;

        if (root.val >= currMax) {
            curr++;
            currMax = root.val;
        }
        return curr + dfs(root.left, currMax) + dfs(root.right, currMax);
    }
}
