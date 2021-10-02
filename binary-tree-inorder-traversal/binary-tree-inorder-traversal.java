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
    public List <Integer> inorderTraversal(TreeNode root) {
        
        List <Integer> list = new ArrayList < > ();
        traversal(root, list);
        return list;
    }

    public void traversal(TreeNode root, List <Integer> list) {
        
        if (root != null) {
            if (root.left != null) {
                traversal(root.left, list);
            }
            
            list.add(root.val);
            if (root.right != null) {
                traversal(root.right, list);
            }
        }
    }
}