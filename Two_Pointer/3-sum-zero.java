// Que :- https://www.interviewbit.com/problems/3-sum-zero/

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
         int i,j,k,l,r,n=a.size(),s,la=909090,x;
    Collections.sort(a);
    ArrayList<ArrayList<Integer>> an=new ArrayList<ArrayList<Integer>>();
    Integer temp[]=new Integer[3];
    for(i=0;i<n-2;i++){
        l=i+1;
        r=n-1;
        x=a.get(i);
        //System.out.println(i+" si "+l+" "+r+" "+x);
        while(l<r){
            s=a.get(l)+a.get(r)+x;
          //  System.out.println(i+" i "+l+" "+r+" "+x);
            if(s==0){
               // System.out.println(i+"i "+l+" "+r+" "+x);
                temp[0]=x;
                temp[1]=a.get(l);
                temp[2]=a.get(r);
                an.add(new ArrayList<Integer>(Arrays.asList(temp)));
                while(l<n-1 && (int)a.get(l)==(int)a.get(l+1)){
                    l++;
                }l++;
                while(l<r && (int)a.get(r)==(int)a.get(r-1)){
                    r--;
                }r--;
            }else if(s>0){
                r--;
            }else{
                l++;
            }
        }
     //   System.out.println(i+"i "+a.get(i)+" "+a.get(i+1)+" "+x);
        while(i<n-1 && (int)a.get(i)==(int)a.get(i+1)){
            i++;
        }
    }
    return an;
    }
}
