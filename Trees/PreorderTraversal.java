//Que: - https://www.interviewbit.com/problems/preorder-traversal/
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
    static void get(){
        while(!q.isEmpty()){
           TreeNode root=q.pop();
            if(root==null){
                continue;
            }
            ans.add(root.val);
            q.push(root.right);
            q.push(root.left);
        }
        
    }
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ans=new ArrayList<Integer>();
        q=new Stack<TreeNode>();
        q.push(root);
        get();
        return ans;
        
    }
}
