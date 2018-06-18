//Que :- https://www.interviewbit.com/problems/sort-by-color/
public class Solution {
    public void sortColors(ArrayList<Integer> a) {
         int i=a.size()-1,c=0,b=0;
        while(i>=0){
            if(a.get(i)==0){
                c++;
            }else if(a.get(i)==1){
                b++;
            }
            i--;
        }i=0;
        while(c-->0){
            a.set(i,0);
            i++;
        }while(b-->0){
            a.set(i,1);
            i++;
        }
        while(i<a.size()){
            a.set(i,2);
            i++;
        }
        //return a;
        //System.out.println(a);
    }
}
