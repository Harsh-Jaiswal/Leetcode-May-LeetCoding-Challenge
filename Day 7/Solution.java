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
    public boolean isCousins(TreeNode root, int x, int y) 
    {
        return getDepth(root,x,0)==getDepth(root,y,0) && getParent(root,x)!=getParent(root,y);
    }
    public int getDepth(TreeNode root,int x,int i)
    {
        if(root==null)
            return 0;
        if(root.val==x)
        {
            return i;
        }
        else
            return getDepth(root.left,x,i+1) | getDepth(root.right,x,i+1);
    }
    public int getParent(TreeNode root,int x)
    {
        if(root==null)
            return 0;
        if(root.right!=null && root.right.val==x)
        {
            return root.val;
        }
        if(root.left!=null && root.left.val==x)
        {
            return root.val;
        }
        else
            return getParent(root.left,x) | getParent(root.right,x);
    }
}