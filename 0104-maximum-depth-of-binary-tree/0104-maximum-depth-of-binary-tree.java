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
    public int maxDepth(TreeNode root) {
        
        return search(root,0);
    }
    public int search(TreeNode root, int cnt){
        
        if(root==null){
            return cnt;
        }
        cnt++;
        int left = search(root.right,cnt);
        int right = search(root.left,cnt);
        int max = Math.max(left,right);
        return max;
        
    }
}