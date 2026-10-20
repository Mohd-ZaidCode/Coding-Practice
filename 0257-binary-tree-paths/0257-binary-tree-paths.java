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
    List<String>ls=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        path("",root);
        return ls;

    }
    public void path(String s,TreeNode root){
        if(root==null)return;
        else if(root.right==null && root.left==null){
            s=s+"->"+root.val;
            ls.add(s.toString().substring(2,s.length()));
            return;
        }
        s=s+"->"+root.val;
        path(s,root.left);
        path(s,root.right);
    }
}