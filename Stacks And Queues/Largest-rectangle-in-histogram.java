// Que :- https://www.interviewbit.com/problems/largest-rectangle-in-histogram/

public class Solution {
    public int largestRectangleArea(ArrayList<Integer> a) {
        int i,j,k,an=0,m,n=a.size();
        if(n<1)
        return 0;
        Stack<Integer> st=new Stack<Integer>();
        for(i=0;i<n;i++){
            if(st.isEmpty() || a.get(st.peek())<=a.get(i)){
                st.push(i);
            }else{
                k=st.peek();
                st.pop();
                m=a.get(k)*(st.isEmpty()?i:(i-st.peek()-1));
                if(m>an)
                    an=m;
                i--;
                
            }
        }
       // System.out.println("till "+an);
        while(!st.isEmpty()){
            k=st.peek();
                st.pop();
                m=a.get(k)*(st.isEmpty()?i:(i-st.peek()-1));
                if(m>an)
                    an=m;
            System.out.println("till "+an);
        }
        
        
    return (int)an;
    }
}
