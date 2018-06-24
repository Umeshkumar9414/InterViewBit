//https://www.interviewbit.com/problems/next-permutation/

public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
        
        int i,k,n=a.size();
        int max=a.get(n-1);
        boolean f=false;
        
        for(i=n-2;i>=0;i--){
            if(a.get(i)<max){
                f=true;
                break;
            }else{
                max=a.get(i);
            }
        }
        k=i;
        if(!f){
            Collections.sort(a);
        }else{
            int mini=++i,min=a.get(mini);
            
            for(;i<n;i++){
                if(min>a.get(i) && a.get(i)>a.get(k)){
                    min=a.get(i);
                    mini=i;
                }
            }
           // System.out.println("k is "+k+" min "+min+" index "+mini);
            int t=a.get(k);
            a.set(k,min);
            a.set(mini,t);
            Collections.sort(a.subList(k+1,n));
        }
        
    }
}
