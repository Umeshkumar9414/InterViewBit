//https://www.interviewbit.com/problems/median-of-array/

public class Solution {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
    if(a.size()>b.size()){
        //System.out.println("yes in "+a.size()+" "+b.size());
        return findMedianSortedArrays(b,a);
    }
   // System.out.println(a.toString());
  // System.out.println("yes in "+a.size()+" "+b.size());
    int x=a.size();
    int y=b.size();
    int s=0,e=x,px,lx,rx,py,ry,ly;
    while(s<=e){
        
        px=(s+e)>>1;
        py=((x+y+1)>>1)-px;
       // System.out.println("px is "+px);
        //System.out.println("py is "+py);
        lx=(px==0)?Integer.MIN_VALUE:a.get(px-1);
        rx=(px==x)?Integer.MAX_VALUE:a.get(px);
        ly=(py==0)?Integer.MIN_VALUE:b.get(py-1);
        ry=(py==y)?Integer.MAX_VALUE:b.get(py);
        if(lx<=ry && ly<=rx){
            if((x+y)%2==0){
                return ((double)Math.max(lx,ly)+Math.min(rx,ry))/2;
            }else{
                return (double)Math.max(lx,ly);
            }
        }else if(lx>ry){
            e=px-1;
        }else{
            s=px+1;
        }
        
    }
    return (double)a.get(0);
 
    }
}
