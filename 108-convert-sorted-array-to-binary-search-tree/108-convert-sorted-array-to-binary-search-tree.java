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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
        
    }
    public TreeNode helper(int[] nums,int i,int e) {
        if(i>e){
            return null;
        }
        int mid = (i+e+1)/2;
        // System.out.println(mid);
        TreeNode n = new TreeNode(nums[mid]);
        n.left = helper(nums,i,mid-1);
        n.right = helper(nums,mid+1,e);
        return n;
    }
    
}