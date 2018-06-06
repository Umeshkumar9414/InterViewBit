//Question link
//https://www.interviewbit.com/problems/find-duplicate-in-array/

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> ar) {
        int n=ar.size();
        //Integer a[]=new Integer[n];
        //a=ar.toArray(a);
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++){
            int e=ar.get(i);
            if(b[e-1]){
               return e; 
            }else{
                b[e-1]=true;
            }
        }
        return -1;
    }
}
