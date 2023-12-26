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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        LinkedList<TreeNode> queue = new LinkedList<>();
        int dist = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                if (dist % 2 == 0) {
                    TreeNode current = queue.removeFirst();

                    if (current.left != null) queue.addLast(current.left);
                    if (current.right != null) queue.addLast(current.right);
                    list.add(current.val);
                } else {
                    TreeNode current = queue.removeLast();

                    if (current.right != null) queue.addFirst(current.right);
                    if (current.left != null) queue.addFirst(current.left);
                    list.add(current.val);
                }
            }

            ans.add(list);
            dist++;
        }

        return ans;
    }
}