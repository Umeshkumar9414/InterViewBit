//Que : https://www.interviewbit.com/problems/array-3-pointers/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        int s[]=new int[3];
        s[0]=a.size();
        s[1]=b.size();
        s[2]=c.size();
        int p[]=new int[3];
        Arrays.fill(p,0);
        int toi,i,j,an=Integer.MAX_VALUE,min,max;
        while(p[0]<s[0] && p[1]<s[1] && p[2]<s[2]){
           // System.out.println(a.get(p[0])+" "+b.get(p[1])+" "+c.get(p[2]));
            if(a.get(p[0])<b.get(p[1])){
               // System.out.println("in 1");
                
                if(b.get(p[1])<c.get(p[2])){
                    max=c.get(p[2]);
                }else{
                    max=b.get(p[1]);
                }
                if(a.get(p[0])<c.get(p[2])){
                    
                    min=a.get(p[0]);
                    p[0]++;
                }else{
                    
                    min=c.get(p[2]);
                    p[2]++;
                }
                
            }else{
               // System.out.println("in 2");
                if(a.get(p[0])<c.get(p[2])){
                    max=c.get(p[2]);
                }else{
                    max=a.get(p[0]);
                }
                if(b.get(p[1])<c.get(p[2])){
                    
                    min=b.get(p[1]);
                    p[1]++;
                }else{
                    
                    min=c.get(p[2]);
                    p[2]++;
                }
            }
            if(an >(max-min)){
                an=max-min;
               // System.out.println("got an "+an+" at "+p[0]+" "+p[1]+" "+p[2]+" "+max+" "+min);
            }
            
        }
        return an;
    }
}
