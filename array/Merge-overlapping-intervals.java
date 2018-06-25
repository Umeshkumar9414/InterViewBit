//Que : - https://www.interviewbit.com/problems/merge-overlapping-intervals/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> a) {
        Collections.sort(a,Comparator.comparingInt(x->x.start));
         ArrayList<Interval> an=new ArrayList<Interval>();
         an.add(a.get(0));
        // System.out.println(a);
        int i,j,n=a.size();
         int last=a.get(0).end;
         j=0;
         for(i=1;i<n;i++){
             Interval x=a.get(i);
             if(x.start<=last){
                 last=Math.max(last,x.end);
                 an.get(j).end=last;
             }else{
                 j++;
                 an.add(x);
                 last=x.end;
             }
         }
         //a=(ArrayList<Interval>)a.subList(0,j+1);
         
        return an;

    }
}
