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
  
        TreeNode root=arrToTree(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode arrToTree(int[] nums, int start, int end){
        if(start>end)
            return null;
        if(start==end)
            return new TreeNode(nums[start]);
        
        int mid= (end-start+1)/2 +start;
        
        TreeNode Mid= new TreeNode(nums[mid]);
        
        Mid.left= arrToTree(nums,start,mid-1);
        Mid.right=arrToTree(nums,mid+1,end);
        return Mid;
    }
    }
