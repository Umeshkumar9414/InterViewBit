//Que :- https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/
 
public class Solution {
    static TreeNode root;
    static void bin(final List<Integer> a,int s,int e){
        
        if(s>e)
            return;
        int m=((e+s)>>1);
      //  System.out.println("bin "+s+" "+e+" "+m);
       // System.out.println("Adding "+a.get(m));
       if(m!=a.size())
        add(a.get(m));
        bin(a,s,m-1);
        bin(a,m+1,e);
    }
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        int s=0,e=a.size()-1,m;
        bin(a,s,e+1);
        return root;
    }
}
