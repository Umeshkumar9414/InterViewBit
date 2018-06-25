//Que: -https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/

public class Solution {
    public int solve(String a) {
                a=a.trim();
        int n=a.length();
        int i=0,j=n-1,k,l,an=0;
        boolean x;
        k=0;
        for(j=1;j<n;j++){
           // System.out.println("in"+j);
            x=true;
            i=0;
            l=j;
            while(i<j){
                if(a.charAt(i)==a.charAt(j)){
                    i++;
                    j--;
                }else{
                    x=false;
                    break;
                }
            }
            if(x){
                k=l;
            }
            j=l;
        }
         return n-k-1;
    }
}
