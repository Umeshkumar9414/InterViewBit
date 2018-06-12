// Que :-  https://www.interviewbit.com/problems/allocate-books/

public class Solution {
    public int books(ArrayList<Integer> a, int k) {
        int n=a.size(),i,j,l;
        if(n==0 && k==0){
            return 0;
        }
        if(n<k || n==0){
            return -1;
        }
        int e=0,s=a.get(0),m,cs,an,tan,c;
        for(i=0;i<n;i++){
            m=a.get(i);
            e+=m;
            if(s<m){
                s=m;
            }
            
        }
        if(n==k){
            return s;
        }
        an=e;
        m=(s+e)>>1;
        while(s<=e){
            cs=0;c=0;tan=0;
            for(i=0;i<n;i++){
                if(cs+a.get(i)>m){
                    c++;
                    if(cs>tan){
                        tan=cs;
                    }
                    cs=a.get(i);
                }else{
                    cs+=a.get(i);
                }
            }
            if(cs!=0){
                if(cs>tan){
                        tan=cs;
                    }
                c++;
            }
            if(c>k){
                s=m+1;
            }else{
                an=tan;
                e=an-1;
            }
            m=(s+e)>>1;
            
        }
        return an;
        
        
        
    }
}
