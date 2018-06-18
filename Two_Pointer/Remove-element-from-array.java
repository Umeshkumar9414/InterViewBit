//Que :- https://www.interviewbit.com/problems/remove-element-from-array/
public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int i=0,j=0;
        
        while(i<a.size()){
            if(a.get(i)!=b){
                if(i!=j){
                    a.set(j,a.get(i));
                }
                j++;
            }
            i++;
        }
        return j;
    }
}
