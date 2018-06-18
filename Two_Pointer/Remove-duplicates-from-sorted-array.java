//QUe :-https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size()==0){
            return 0;
        }
        int i,j;
       i=1;j=1;
       while(i<a.size()){
           if((int)a.get(i)!=(int)a.get(i-1)){
             //  System.out.println((a.get(i)!=a.get(i-1))+" "+a.get(i)+" "+a.get(i-1));
               a.set(j,a.get(i));
               j++;
           }
           i++;
       }
       return j;
    }
}
