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
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(root,0);
        q.add(p);
       
        int ans =1;
        while(!q.isEmpty()){
            int n = q.size();
            int min = q.peek().num;
            int first =0;
            int last =0;
            for(int i=0;i<n;i++){
                Pair curr = q.poll();       
                int currid = curr.num-min;
                
                if(i==0) first = currid;
                if(i==n-1) last = currid;
                
                if(curr.node.left != null){
                    q.add(new Pair(curr.node.left,2*currid +1));
                }
                
                if(curr.node.right != null){
                    q.add(new Pair(curr.node.right,2*currid +2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}
    
   

class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node = node;
        this.num = num;
    }
}