//Que :- https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


 //Definition for binary tree
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
class Pair{
    TreeNode root;
    int h;
    public Pair(TreeNode r,int he){
        root =r;
        h=he;
    }
}
public class Solution {
    static TreeMap<Integer,ArrayList<Integer>> an;
    static Queue<Pair> q;
    static void get(){
        while(!q.isEmpty()){
            Pair p=q.poll();
            int h=p.h;
            TreeNode root =p.root;
            if(root==null){
                continue;
            }
            if(an.get(h)==null){
                an.put(h,new ArrayList<Integer>());
            }
            an.get(h).add(root.val);
            q.add(new Pair(root.left,h-1));
            q.add(new Pair(root.right,h+1));
        }
        
    }
    
    static ArrayList<ArrayList<Integer>> mm(TreeNode root){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        an=new TreeMap<Integer,ArrayList<Integer>>();
        q=new LinkedList<Pair>();
        q.add(new Pair(root,0));
        get();
        for(Map.Entry e:an.entrySet()){
            ans.add((ArrayList<Integer>)e.getValue());
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TreeNode root =new TreeNode(6);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(7);
        root.right.right=new TreeNode(9);
        System.out.println(mm(root));
       
    }
}
