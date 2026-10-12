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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            if(root.val==1)return true;
            else return false;
        }else if(root.left==null){
            return evaluateTree(root.right);
        }
        else if(root.right==null){
            return evaluateTree(root.left);
        }
        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);
        if(root.val==2)return left||right;
        return left && right;
    }
}