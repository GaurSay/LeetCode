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
    static int max = 0 ;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = Integer.MIN_VALUE;
        helper(root);
        return max;
    }
    public int helper(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftmax = Math.max(helper(root.left),0);
        int rightmax = Math.max(helper(root.right),0);
        
        max = Math.max(max, root.val + leftmax + rightmax);
          
        return root.val + Math.max(leftmax,rightmax);
    }
}