/* Given an even number ( greater than 2 ), return two prime numbers whose sum is equal to given number.*/


public class Solution {
    public ArrayList<Integer> primesum(int n) {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
		boolean p[]=new boolean[n+1];
	//	System.out.println(Arrays.toString(p));
		p[0]=p[1]=true;
		int i,j,k;
		for(i=2;i<=n;i++){
		    if(!p[i]){
		        a.add(i);
		        for(j=i*2;j<=n;j+=i){
		            p[j]=true;
		        }
		    }
		}k=a.size();
	//	System.out.println(Arrays.toString(p));
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(i=0;i<k;i++){
		    if(!p[n-a.get(i)]){
		        //	ArrayList<Integer> b=new ArrayList<Integer>();
		        	b.add(a.get(i));
		        	b.add(n-a.get(i));
		        //	System.out.println(b);
		        	return b;
		    }
		}
		
		return b;
		
        
        
    }
}
