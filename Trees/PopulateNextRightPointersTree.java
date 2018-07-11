//Que :- https://www.interviewbit.com/problems/populate-next-right-pointers-tree/
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    static TreeLinkNode getNextRight(TreeLinkNode tmp){
        TreeLinkNode p=tmp.next;
        while(p!=null){
            if(p.left!=null){
                return p.left;
            }else if(p.right!=null){
                return p.right;
            }
            p=p.next;
        }
        return null;
    }
    public void connect(TreeLinkNode root) {
        if(root==null)return;
        TreeLinkNode p=root,q;
        p.next=null;
        while(p!=null){
            q=p;
           // System.out.println("p is "+p.val);
            while(q!=null){
                //System.out.println("q is "+q.val);
                if(q.left!=null){
                    if(q.right!=null){
                        q.left.next=q.right;
                    }else{
                        q.left.next=getNextRight(q);
                    }
                }
                if(q.right!=null){
                    q.right.next=getNextRight(q);
                }
                q=q.next;
                
            }
            if(p.left!=null){
                p=p.left;
            }else if(p.right!=null){
                p=p.right;
            }else{
                p=getNextRight(p);
            }
            
        }
      //  return root;
        
    }
}
