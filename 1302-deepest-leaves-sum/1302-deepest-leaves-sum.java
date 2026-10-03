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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)return 0;
        int lvl=level(root);
        return sum(lvl,root,1);
        
    }
    public int level(TreeNode root){
        if(root==null)return 0;
        int left=1+level(root.left);
        int right=1+level(root.right);
        return Math.max(left,right);
    }
    public int sum(int lvl,TreeNode root,int curr){
        if(root==null)return 0;
        if(curr==lvl)return root.val;
        return sum(lvl,root.left,curr+1)+sum(lvl,root.right,curr+1);
    }
}