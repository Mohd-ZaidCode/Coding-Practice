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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode>map=new HashMap<>();
        Set<TreeNode>mapHead=new HashSet<>();
        TreeNode head=null;
        for(int[] arr:descriptions){
        TreeNode temp=null;
        if(map.containsKey(arr[0]))temp=map.get(arr[0]);
        else{
            temp=new TreeNode(arr[0]);
            map.put(arr[0],temp);
            mapHead.add(temp);
        }
        if(map.containsKey(arr[1])){
            TreeNode child=map.get(arr[1]);
            if(mapHead.contains(child))mapHead.remove(child);
            if(arr[2]==1){
                temp.left=child;
            }
            else temp.right=child;
        }else{
            if(arr[2]==1){
                temp.left=new TreeNode(arr[1]);
                map.put(arr[1],temp.left);
            }
            else {
                temp.right=new TreeNode(arr[1]);
                map.put(arr[1],temp.right);
                }
        }
        }
        for(TreeNode t:mapHead)head=t;
        return head;
    }
}