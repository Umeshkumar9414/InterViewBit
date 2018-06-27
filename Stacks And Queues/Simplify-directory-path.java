// https://www.interviewbit.com/problems/simplify-directory-path/

public class Solution {
    public String simplifyPath(String a) {
        a=a.substring(1);
        Stack<String> st=new Stack<String>();
        String ar[]=a.split("/+");
        int i,j,k,n=ar.length;
         for(i=0;i<n;i++){
            // System.out.println(ar[i]);
             if(ar[i].equals("..")){
                 if(!st.isEmpty())
                 st.pop();
             }else if(ar[i].equals(".")){
                 
             }else{
                 st.push(ar[i]);
             }
         }
         StringBuilder an=new StringBuilder("");
         while(!st.isEmpty()){
             an.insert(0,st.pop()+"/");
             
         }
         if(an.length()==0){
             return "/";
         }
         an.insert(0,"/");
         
         return an.substring(0,an.length()-1);
    }
}
