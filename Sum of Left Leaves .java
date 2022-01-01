//https://leetcode.com/problems/sum-of-left-leaves/
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)
            return 0;
        if(root.right!=null)
            sum+=sumOfLeftLeaves(root.right);
        if(root.left!=null){
            sum+= sumOfLeftLeaves(root.left);
            if(root.left.left==null && root.left.right==null)
                sum+=root.left.val;
        }
     return sum;   
    }
}
/*
class Solution {
    int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;

        return dfs(root);
    }
    private int dfs(TreeNode root){
        if(root == null)
            return 0;
        
        if(root.left!=null){
            if(root.left.left == null &&
               root.left.right == null)
                sum += root.left.val;
            dfs(root.left);
        }
        if(root.right!=null){
            dfs(root.right);
        }
        
        return sum;
    }
}
*/
