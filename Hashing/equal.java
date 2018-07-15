//Que :- https://www.interviewbit.com/problems/equal/
class Pair{
    int a,b;
    public Pair(int x,int y){
        a=x;
        b=y;
    }
}
class x{
    int a,b,c,d;
    x(Pair s,Pair e){
        a=s.a;
        b=s.b;
        c=e.a;
        d=e.b;
    }
}
public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        int i,j,k,n=a.size();
        HashMap<Integer,Pair> hm=new HashMap<Integer,Pair>();
        ArrayList<x> an=new ArrayList<x>();
        for(j=1;j<n;j++){
            for(i=0;i<j;i++){
                k=a.get(i)+a.get(j);
                if(hm.get(k)==null){
                    hm.put(k,new Pair(i,j));
                }else{
                    Pair p=hm.get(k);
                    if(p.a<i && p.b!=j && p.b!=i){
                        an.add(new x(p,new Pair(i,j)));
                        //p.a,p.b,i,j;
                    }else if(p.a>i && p.b!=j && p.b!=i){
                        an.add(new x(new Pair(i,j),p));
                        hm.put(k,new Pair(i,j));
                    }
                }
            }
        }
        Collections.sort(an,new Comparator<x>(){
            @Override
            public int compare(x a,x b){
                if(a.a!=b.a){
                    return a.a-b.a;
                }else if(a.b!=b.b){
                    return a.b-b.b;
                }else if(a.c!=b.c){
                    return a.c-b.c;
                }else{
                    return a.d-b.d;
                }
            }
            });
            if(an.size()!=0){
                x d=an.get(0);
                return new ArrayList<Integer>(Arrays.asList(new Integer[]{d.a,d.b,d.c,d.d}));
            }
        return new ArrayList<Integer>();
       
    }
}
