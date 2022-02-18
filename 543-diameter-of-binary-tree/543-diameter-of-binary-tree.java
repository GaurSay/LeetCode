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
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diameter;
    }
     public Node helper(TreeNode root){
        if(root == null){
            Node n = new Node(0,0);
            return n;
        }
        Node leftnode = helper(root.left);
        Node rightnode = helper(root.right);
       
        int height = 1 + Math.max(leftnode.height,rightnode.height);
        int diameter = Math.max(Math.max(leftnode.diameter,rightnode.diameter),leftnode.height+rightnode.height);
        Node ans = new Node(height,diameter);
        return ans;
    }
}

class Node{
    int height;
    int diameter;
    Node(int height,int diameter){
        this.height = height;
        this.diameter = diameter;
    }
}