//Que :- https://www.interviewbit.com/problems/symmetric-binary-tree/

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
    static boolean get(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null)
            return false;
       // System.out.println("at "+l.val+" "+r.val);
       if(l.val!=r.val){
           
           return false;
       }
        return (get(l.left,r.right) && get(l.right,r.left));
        
    }
    public int isSymmetric(TreeNode root) {
        if(get(root.left,root.right)){
            return 1;
        }
        return 0;
    }
}
