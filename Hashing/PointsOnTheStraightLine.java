//Que :- https://www.interviewbit.com/problems/points-on-the-straight-line/

public class Solution {
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n=a.size(),i,j,k;
    if(n<3)
        return n;
    HashMap<Pair,Integer> hm=new HashMap<Pair,Integer>();
    int an=0,ver=0,same=0,f=0;
    for(i=0;i<n;i++){
        f=ver=same=0;
        hm.clear();
        for(j=i+1;j<n;j++){
            if(a.get(i)==a.get(j) && b.get(i)==b.get(j)){
                same++;
            }
            else if(a.get(i)==a.get(j)){
                ver++;
            }else{
                int xd=a.get(i)-a.get(j);
                int yd=b.get(i)-b.get(j);
                int g=gcd(xd,yd);
                xd/=g;
                yd/=g;
                Pair p=new Pair(xd,yd);
                if(hm.get(p)==null){
                    k=1;
                }else{
                    k=hm.get(p)+1;
                }
                hm.put(p,k);
                if(k>f){
                    f=k;
                }
            }
        }
        f=Math.max(f,ver);
        an=Math.max(an,f+same+1);
    }
    
    return an;
    }
    static int gcd(int a,int b){
    if(b==0){
        return a;
    }else{
        return gcd(b,a%b);
    }
}

}
class Pair{
    int f,s;
    public Pair(int a,int b){
        f=a;
        s=b;
    }
    @Override
    public int hashCode(){
        return 9113*f+s;
    }
    @Override
    public boolean equals(Object o)
    {
        Pair p=(Pair)o;
        if(this.f==p.f && this.s==p.s){
            return true;
        }else{
            return false;
        }
    }
       
}

