//Que :- https://www.interviewbit.com/problems/n3-repeat-number/

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        
         int i=0,j=0,k,l,n=a.size();
         if(a.size()==0){
             return -1;
         }
         if(n<3){
             return a.get(0);
         }
        int c1=0,c2=0,x=a.get(0),y=a.get(1);
        
        for(i=0;i<n;i++){
            if(a.get(i)==x){
                c1++;
            }else if(a.get(i)==y){
                c2++;
            }else if(c1==0){
                x=a.get(i);
                c1=1;
            }else if(c2==0){
                y=a.get(i);
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
      //  System.out.println(x+" "+y);
        c1=0;
        c2=0;
        for(i=0;i<n;i++){
            if(a.get(i)==x){
                c1++;
            }else if(a.get(i)==y){
                c2++;
            }
        }
        if(c1>n/3){
            return x;
        }else if(c2>n/3){
            return y;
        }else{
            return -1;
        }
    }
}
