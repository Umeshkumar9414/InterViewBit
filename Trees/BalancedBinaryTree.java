//Que:- https://www.interviewbit.com/problems/balanced-binary-tree/
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
     static int get(TreeNode root){
        if(root==null){
            return 0;
        }
        int l,r;
        l=get(root.left);
        r=get(root.right);
        if(l==-1 || r==-1 || Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
        
        
    }
    public int isBalanced(TreeNode root) {
        if(get(root)>=0){
            return 1;
        }
        return 0;
    }
}
