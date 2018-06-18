//Que :- https://www.interviewbit.com/problems/intersection-of-sorted-arrays/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        int i=0,j=0,n=a.size(),m=b.size();
        ArrayList<Integer> an=new ArrayList<Integer>();
        while(i<n && j<m){
            if((int)a.get(i)<(int)b.get(j)){
                i++;
            }else if((int)a.get(i)>(int)b.get(j)){
                j++;
            }else{
                an.add(a.get(i));
                i++;j++;
            }
        }
       // System.out.println(an);
       return an;
    }
}
