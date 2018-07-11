//Que :- https://www.interviewbit.com/problems/shortest-unique-prefix/

class Node{
    Node a[];
    int isEnd;
    int isPend;
    Node(){
        a=new Node[100];
        isEnd=-1;
        isPend=-1;
    }
}
public class Solution {
    
    public ArrayList<String> prefix(ArrayList<String> a) {
        int an[];
        Node root;
        int i,j,k,l,nn=a.size();
        root=new Node();
        an=new int[nn];
        for(l=0;l<nn;l++){
            String s=a.get(l);
            int n=s.length(),x,xx=0;
            Node tmp=root;
            boolean found =false;
        
            for(i=0;i<n;i++){
                x=s.charAt(i)-'A';
                if(tmp.a[x]==null){
                    tmp.a[x]=new Node();
                    if(!found){
                        tmp.a[x].isPend=l;
                        an[l]=i+1;
                    }
                    found =true;
                }else{
                    j=tmp.a[x].isPend;
                    if(j!=-1){
                        tmp.a[x].isPend=-1;
                        xx=a.get(j).charAt(an[j])-'A';
                        tmp.a[x].a[xx].isPend=j;
                        an[j]++;
                    }
                
                }
                tmp=tmp.a[x];
            }
        }
        
        ArrayList<String> ans=new ArrayList<String>();
        for(i=0;i<nn;i++){
            ans.add(a.get(i).substring(0,an[i]));
        }
        return ans;
    }
}
