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
    int res=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return -1;
        if(root.val>=low && root.val<=high)res+=root.val;
        int a=rangeSumBST(root.left,low,high);
        int b=rangeSumBST(root.right,low,high);
        return res;

    }
}