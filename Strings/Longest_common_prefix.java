// Que :-  https://www.interviewbit.com/problems/longest-common-prefix/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> a) {
          int i,j,k,l;
       // int n=a.length;
        int n=a.size();
        //String an=a[0];
        String an=a.get(0);
        k=an.length();
        for(i=1;i<n;i++){
            j=0;
            l=a.get(i).length();
            while(j<k && j<l && an.charAt(j)==a.get(i).charAt(j)){//a[i].charAt(j)
                j++;
            }
            k=j;
        }
        
        return an.substring(0,k);
        
    }
}
