//https://www.interviewbit.com/problems/nearest-smaller-element/

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> a) {
        Stack<Integer> st=new Stack<Integer>();
         int i,x,k,n=a.size();
         ArrayList<Integer> an=new ArrayList<Integer>(n);
         for(i=0;i<n;i++){
             k=-1;
             while(!st.isEmpty()){
                 x=st.pop();
                 if(x<a.get(i)){
                     k=x;
                     st.push(x);
                     break;
                 }
             }
             an.add(k);
             st.push(a.get(i));
         }
         return an;
    }
}
