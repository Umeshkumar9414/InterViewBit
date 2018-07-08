//Que :- https://www.interviewbit.com/problems/identical-binary-trees/
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
        return (get(l.left,r.left) && get(l.right,r.right));
        
    }
    public int isSameTree(TreeNode A, TreeNode B) {
        if(get(A,B))
        return 1;
        return 0;
    }
}
