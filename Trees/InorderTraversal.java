//Que:- https://www.interviewbit.com/problems/inorder-traversal/
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
    static ArrayList<Integer> ans;
    static Stack<TreeNode> q;
    static void get(TreeNode root){
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
            ans.add(x.val);
            if(x.right!=null){
                x=x.right;
                while(x!=null){
                    q.push(x);
                    x=x.left;
                }
            }
            
        }
        
    }
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ans=new ArrayList<Integer>();
        q=new Stack<TreeNode>();
      //  q.push(root);
        get(root);
        return ans;
    }
}
