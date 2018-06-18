//Que :- https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i=0,j=0,n=a.size(),m=b.size();
        ArrayList<Integer> an=new ArrayList<Integer>();
        while(i<n && j<m){
            if((int)a.get(i)<(int)b.get(j)){
                an.add(a.get(i));
                i++;
            }else{
                an.add(b.get(j));
                j++;
            }
        }
        while(i<n){
            an.add(a.get(i));
            i++;
        }
        while(j<m){
            an.add(b.get(j));
            j++;
        }
        a.clear();
        a.addAll(an);
       
        
    }
}
