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
    public boolean isSameTree(TreeNode bst1, TreeNode bst2) {
        
        if((bst1==null && bst2!=null) || (bst2==null && bst1!=null)) return false;
        else if(bst1==null && bst2 == null) return true;
        else if(bst1.val!=bst2.val) return false;
        else return bst1.val == bst2.val && isSameTree(bst1.left,bst2.left) && isSameTree(bst1.right, bst2.right);
    }
}