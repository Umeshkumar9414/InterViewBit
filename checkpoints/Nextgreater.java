//Que :=https://www.interviewbit.com/problems/nextgreater/

public class Solution {
    public int[] nextGreater(int[] a) {
        int i,n=a.length;
        int an[]=new int[n];
       Stack<Integer> st=new Stack<Integer>();
       for(i=n-1;i>=0;i--){
           if(st.isEmpty()){
               an[i]=-1;
           }
           else{
               int x=st.pop();
               while(!(st.isEmpty()) && x<=a[i]){
                   x=st.pop();
               }if(x<=a[i] && st.isEmpty())
                    an[i]=-1;
                else{
                    st.push(x);
                    an[i]=x;
                   
                }
           }
            st.push(a[i]);
       }
        return an;
    }
}
