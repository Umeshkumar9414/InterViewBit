//https://www.interviewbit.com/problems/gray-code/

public class Solution {
    public ArrayList<Integer> grayCode(int n) {
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(0);
    a.add(1);
    int j=0,k,i=1,d=-1,to=2;
    while(i<n){
            j=a.size()-1;
            k=-1;
      //  System.out.println("now array is "+a+" dir is "+d+" "+j+" "+k);
        for(;j!=k;j+=d){
            a.add(to|a.get(j));
        }
      //  d=-1*d;
        to=to<<1;
        i++;
    }
    return a;
    }
}
