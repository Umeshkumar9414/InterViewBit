//Que := https://www.interviewbit.com/problems/valid-binary-search-tree/
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
    static int min;
    static boolean check(TreeNode a){
        if(a==null)
        return true;
        if(check(a.left)){
            if(a.val>min){
                min=a.val;
                if(check(a.right)){
                    return true;
                }
            }
        }
        return false;
            
    }
    public int isValidBST(TreeNode a) {
        min=Integer.MIN_VALUE;
        if(check(a)){
            return 1;
        }
        return 0;
        
    }
}
