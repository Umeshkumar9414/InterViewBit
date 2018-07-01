// Que:- https://www.interviewbit.com/problems/container-with-most-water/

public class Solution {
    public int maxArea(ArrayList<Integer> a) {
    int n=a.size(),i,l=0;
    int s=0,e=n-1;
    long an=0,j;
    while(s<e){
        j=Math.min(a.get(s),a.get(e))*(long)(e-s);
        if(j>an){
            an=j;
        }
        if(a.get(s)<a.get(e)){
            s++;
        }else{
            e--;
        }
    }
    return (int)an;
    }
}
