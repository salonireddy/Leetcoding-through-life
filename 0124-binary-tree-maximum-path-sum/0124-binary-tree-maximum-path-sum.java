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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right==null) return root.val;
        helper(root);
        return max;
    }
    int helper(TreeNode root){
        if(root==null) return 0;

        int l = Math.max(0,helper(root.left));
        int r = Math.max(0,helper(root.right));

        max = Math.max(root.val + l + r , max);
        return root.val + Math.max(l,r);
    }
}