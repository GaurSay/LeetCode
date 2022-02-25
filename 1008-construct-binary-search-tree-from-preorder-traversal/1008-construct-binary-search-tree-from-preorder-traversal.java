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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length-1);
    }
    
    public TreeNode helper(int[] preorder,int l,int r) {
        if(l>r){
            return null;
        }
        TreeNode n = new TreeNode(preorder[l]);
        int i;
        for(i=l;i<=r;i++) {
        if(preorder[i] > n.val)
            break;
        }
        n.left = helper(preorder,l+1,i-1);
        n.right = helper(preorder,i,r);
        return n;
    }
    
}