//Que :- https://www.interviewbit.com/problems/minimize-the-absolute-difference/

public class Solution {
    public int solve(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        int i=0,j=0,n=a.size(),m=b.size(),k=0,o=c.size(),an=Integer.MAX_VALUE;
        int min,max,toi=1;
        while(i<n && j<m && k<o){
            
            min=max=a.get(i);toi=1;
            if(b.get(j)<min){
                min=b.get(j);
                toi=2;
            }
            if(c.get(k)<min){
                min=c.get(k);
                toi=3;
            }
            if(b.get(j)>max){
                max=b.get(j);
            }
            if(c.get(k)>max){
                max=c.get(k);
            }
            if((long)max-min<(long)an){
                an=max-min;
            }
            //System.out.println(i+" i "+j+" j "+k+" k "+min+" min "+max+" max  "+toi);
            
            int t=toi==1?i++:((toi==2)?j++:k++);
            
        }
        return an;
    }
}
