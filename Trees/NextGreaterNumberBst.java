//Que :- https://www.interviewbit.com/problems/next-greater-number-bst/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode getSuccessor(TreeNode a, int b) {
        TreeNode ans;
        ans=null;
        while(a!=null){
            if(a.val>b ){
                if(ans==null ||ans.val>a.val){
                    ans=a;
                }
                a=a.left;//try to find more miinimum
            }else{
                a=a.right;//try to find maximum
            }
        }
        return ans;
    }
}
