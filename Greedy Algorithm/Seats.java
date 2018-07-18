//Que :- https://www.interviewbit.com/problems/seats/
public class Solution {
    public int seats(String s) {
        int i,j,k,n=s.length(),an=0,mo=10000003;
        int fi=-1,nx=0;
        i=0;
        while(i<n){
            if(s.charAt(i)=='x'){
                nx++;
            }
            i++;
        }
        j=0;
      //  System.out.println("nx "+nx);
        if(nx<2){
            return 0;
        }i=0;
        while(true){
            if(s.charAt(i)=='x'){
                j++;
                if(j==((nx/2)+1)){
                    break;
                }
            }
            i++;
            
        }
        an=0;fi=i--;
        j=i;
      //  System.out.println("fi "+fi+" "+an);
        while(i>=0){
            if(s.charAt(i)=='x'){
                an=(an+(j-i))%mo;
                j--;
            }
           // System.out.println("at "+i+" j "+j+" an "+an);
            i--;
            
        }
        i=fi+1;j=i;
        while(i<n){
            if(s.charAt(i)=='x'){
                an=(an+(i-j))%mo;
                j++;
            }
          //  System.out.println("at "+i+" j "+j+" an "+an);
            i++;
            
        }
        return an;
        
    }
}
