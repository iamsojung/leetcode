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
        
        int size = nums.length;
        TreeNode node = new TreeNode();
        if(size==0){
            return null;
        }
        if(size==1){
            node.val = nums[0];
            node.left = null;
            node.right = null;
            return node;
        }
        
        node.val = nums[size/2];
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, size/2 ));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums,size/2 +1,size ));
            
        return node;
        
    }
}