//https://www.interviewbit.com/problems/hotel-reviews/
class Trie{
    boolean isEnd;
    Trie a[]=new Trie[26];
    public Trie(){
        isEnd=false;
        int i;
        for(i=0;i<26;i++){
            a[i]=null;
        }
    }
}
public class Solution {
static Trie node;
static void add(String s){
    int l=s.length(),i;
    Trie temp=node;
    for(i=0;i<l;i++){
        int x=s.charAt(i)-'a';
        if(temp.a[x]==null){
            temp.a[x]=new Trie();
        }
        temp=temp.a[x];
    }
    temp.isEnd=true;
}
static boolean find(String s){
    int l=s.length(),i;
    Trie temp=node;
    for(i=0;i<l;i++){
        int x=s.charAt(i)-'a';
        if(temp.a[x]==null){
            return false;
        }
        temp=temp.a[x];
    }
    return temp.isEnd;
}
    public ArrayList<Integer> solve(String s, ArrayList<String> a) {
    String as[]=s.split("_");
    node=new Trie();
    int i,j,k,l;
    for(i=0;i<as.length;i++){
        add(as[i]);
    }
    int n=a.size();
    int an[][]=new int[n][2];
    for(i=0;i<n;i++){
        an[i][0]=i;
        an[i][1]=0;
        String f[]=a.get(i).split("_");
        for(j=0;j<f.length;j++){
            if(find(f[j])){
                an[i][1]++;
            }
        }
        
    }
    Arrays.sort(an,new Comparator<int []>(){
        @Override
        public int compare(int a[],int b[]){
            if(a[1]!=b[1]){
                return b[1]-a[1];
            }else{
                return a[0]-b[0];
            }
        }
    });
    ArrayList<Integer> ans=new ArrayList<Integer>();
    for(i=0;i<n;i++){
        ans.add(an[i][0]);
    }
    return ans;
    }
}
