//Que:- https://www.interviewbit.com/problems/postorder-traversal/
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
        do{
        while(root!=null){
            if(root.right!=null)
            q.push(root.right);
            q.push(root);
            root=root.left;
        }
        
            root=q.pop();
            if(root.right!=null && !q.isEmpty() &&root.right==q.peek()){
                q.pop();
                q.push(root);
                root=root.right;
            }else{
                ans.add(root.val);
                root=null;
            }
            
        }while(!q.isEmpty());
        
    }
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
         ans=new ArrayList<Integer>();
        q=new Stack<TreeNode>();
      //  q.push(root);
        get(root);
        return ans;
    }
}
