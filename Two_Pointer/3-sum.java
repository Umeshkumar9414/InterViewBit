// Que :- https://www.interviewbit.com/problems/3-sum/

public class Solution {
    public int threeSumClosest(ArrayList<Integer> a, int t) {
    int i,j,k,l,r,n=a.size(),s,x;
    int an=Integer.MAX_VALUE;
    Collections.sort(a);
    for(i=0;i<n-1;i++){
        l=i+1;
        r=n-1;
        x=a.get(i);
        //System.out.println(i+" si "+l+" "+r+" "+x);
        while(l<r){
            s=a.get(l)+a.get(r)+x;
            if(Math.abs(s-t)<Math.abs(an)){
                an=s-t;
            }
            
            
            if(s==t){
               // System.out.println(i+"i "+l+" "+r+" "+x);
                an=0;
                break;
               
            }else if(s>t){
                r--;
            }else{
                l++;
            }
        }
    
    }
    return an+t;
    }
}
