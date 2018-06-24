//Que :- https://www.interviewbit.com/problems/evaluate-expression/

public class Solution {
    public int evalRPN(ArrayList<String> a) {
        int an=0;
      Stack<Integer> st=new Stack<Integer>();
         int i,j,k,n=a.size();
        for(i=0;i<n;i++){
            String op=a.get(i);
            if(op.equals("+")){
                j=st.pop();
                k=st.pop();
                st.push(j+k);
            }else if(op.equals("-")){
                j=st.pop();
                k=st.pop();
                st.push(k-j);
            }else if(op.equals("*")){
                j=st.pop();
                k=st.pop();
                st.push(j*k);
            }else if(op.equals("/")){
                j=st.pop();
                k=st.pop();
                st.push(k/j);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
         
      return st.pop(); 
        
    }
}
