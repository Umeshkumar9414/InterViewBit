//Que :- https://www.interviewbit.com/problems/kth-smallest-element-in-tree/

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
    static Stack<TreeNode> q;
    static int get(TreeNode root,int k){
        if(root==null){
            return;
        }
        TreeNode main=root;
        while(root!=null){
            q.push(root);
            root=root.left;
        }
        while(!q.isEmpty()){
            TreeNode x=q.pop();
            k--;
            if(k==0){
                return x.val;
            }
            if(x.right!=null){
                x=x.right;
                while(x!=null){
                    q.push(x);
                    x=x.left;
                }
            }
            
        }
        
    }
    public int kthsmallest(TreeNode root, int k) {
        q=new Stack<TreeNode>();
        return get(root,k);
    }
}
