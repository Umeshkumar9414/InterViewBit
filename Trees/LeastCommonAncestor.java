//Que :- https://www.interviewbit.com/problems/least-common-ancestor/
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
    static boolean v1,v2;
    static boolean search(TreeNode root,int a){
        if(root==null){
            return false;
        }
        if(root.val==a){
            return true;
        }
        else 
            return (search(root.left,a) || search(root.right,a));
    }
    static TreeNode find(TreeNode root, int a, int b){
        if(root==null){
            return null;
        }
        if(root.val==a){
            v1=true;
            return root;
        }else if(root.val==b){
            v2=true;
            return root;
        }
        TreeNode left=find(root.left,a,b);
        TreeNode right=find(root.right,a,b);
        
        if(left!=null && right!=null){
            return root;
        }
        return (left!=null)?left:right;
    }
    public int lca(TreeNode root, int a, int b) {
         v1=false;v2=false;
        TreeNode ans=find(root,a,b);
        if(ans==null){
            return -1;
        }
        if(!v1){
            v1=search(root,a);
        }
        if(!v2){
            v2=search(root,b);
        }
        if(v1 && v2){
            return ans.val;
        }
        return -1;
    }
}
