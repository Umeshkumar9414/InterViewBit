//ue : - https://www.interviewbit.com/problems/maximum-consecutive-gap/

class Bucket{
    int min,max;
    public Bucket(){
        min=-1;
        max=-1;
    }
}
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {
         int i,j,m,n=a.size(),x,f;
     //                               System.out.println(a);
        if(n<2 || a==null){
            return 0;
        }
        int max=a.get(0),min=a.get(0);
        for(i=0;i<n;i++){
                max=Math.max(max,a.get(i));
           
                min=Math.min(min,a.get(i));
            
        }
    //                            System.out.println(max+" "+min);
        if(max-min<2){
            return max-min;
        }if(n==2){
            return max-min;
        }
        double inte=((float)n)/(max-min);
        Bucket b[]=new Bucket[n+1];
        for(i=0;i<n+1;i++)b[i]=new Bucket();
        for(i=0;i<n;i++){
            x=(int)(inte*(a.get(i)-min));
            if(b[x].min==-1){
                b[x].min=a.get(i);
                b[x].max=a.get(i);
            }else{
                b[x].min=Math.min(b[x].min,a.get(i));
                b[x].max=Math.max(b[x].max,a.get(i));
            }
        }
        
        // for(i=0;i<n+1;i++){
        //     System.out.println("max "+b[i].max);
        // }
        
        int an=0;
        x=b[0].max;
        for(i=1;i<n+1;i++){
            if(b[i].min!=-1){
                an=Math.max(an,b[i].min-x);
                x=b[i].max;
            }
      //   System.out.println("now res"+an);
        }
       
        return an;
        
       
    }
}
