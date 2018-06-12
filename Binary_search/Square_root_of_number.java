//Que  :- https://www.interviewbit.com/problems/square-root-of-integer/

public class Solution {
    public int sqrt(int a) {
        
       if(a==1 || a==0){
           return a;
       }
       long s=1,e=a,an=-1,m;
       long sq=1;
       m=(s+e)>>1;
       while(s<=e){
           
           sq=((long)(m))*m;
          // System.out.println(sq);
           if(sq==a){
               return (int)m;
           }
           if(sq>a){
               e=m-1;
               
           }else{
               an=m;
               s=m+1;
           }
           m=(s+e)>>1;
           //System.out.println(s+ " is s now m is "+m+" e u "+e);
       }
       return (int)an;
    }
}
