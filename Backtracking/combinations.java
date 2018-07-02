//Que:- https://www.interviewbit.com/problems/combinations/

public class Solution {
    static ArrayList<ArrayList<Integer>> an;
    static void co(ArrayList<Integer> x,int n,int k,int i){
       // System.out.println("starting x is "+x);
        
        if(x.size()==k){
            an.add(new ArrayList<Integer>(x));
            return;
        }
        
        if(i>n){
            return ;
        }
        
        x.add(i);
       // System.out.println("now x is "+x);
        co(x,n,k,i+1);
        x.remove(x.size()-1);
        co(x,n,k,i+1);
    }
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        an=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> x=new ArrayList<Integer>();
        co(x,n,k,1);
        return an;
    }
}
