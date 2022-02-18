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
    public boolean isBalanced(TreeNode root) {
        return helper(root).isBalance;
    }
    public node helper(TreeNode root){
        if(root == null){
            node n = new node();
            n.height = 0;
            n.isBalance = true;
            return n;
        }
        node left = helper(root.left);
        node right = helper(root.right);
        node ans = new node();
        ans.height = Math.max(left.height,right.height)+1;
        if(!left.isBalance || !right.isBalance || Math.abs(left.height-right.height)>1){
            ans.isBalance = false;
        }
        else{
            ans.isBalance = true;
        }
        return ans;
    }
}
class node{
    int height;
    boolean isBalance;
}