//Que :- https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/

public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        
        if(a.size()<3){
            return a.size();
        }
        int i,j;
       i=2;j=1;
       while(i<a.size()){
           if((int)a.get(i)!=(int)a.get(i-1) || (int)a.get(j)!=(int)a.get(j-1)){
             //  System.out.println((a.get(i)!=a.get(i-1))+" "+a.get(i)+" "+a.get(i-1));
               j++;
               a.set(j,a.get(i));
           }
           i++;
       }
       return j+1;
        
    }
}
