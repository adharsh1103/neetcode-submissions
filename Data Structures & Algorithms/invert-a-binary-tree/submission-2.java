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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = root;
        if(root == null) return null;
        //if(temp.left == null && temp.right == null || temp == null) return temp;;
        //if(temp.left != null && temp.right != null){
            
            TreeNode sw = temp.left;
            temp.left = temp.right;
            temp.right = sw;
            invertTree(temp.left);
            invertTree(temp.right);
     //   }
        return root;
    }
}
