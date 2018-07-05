// Que :- https://www.interviewbit.com/problems/merge-k-sorted-lists/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
    
    @Override
    public String toString(){
        ListNode f=this;
        StringBuffer re=new StringBuffer("");
        while(f!=null){
            re.append(f.val+"->");
            f=f.next;
        }
        return re.toString();
    }
 }

public class Solution {
    
private static final Scanner scanner = new Scanner(System.in);
static ListNode sort(ArrayList<ListNode> a){
    int i,j,k,n=a.size();
    TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
    for(i=0;i<n;i++){
        ListNode x=a.get(i);
        while(x!=null){
            k=x.val;
            if(tm.get(k)==null){
                tm.put(k,1);
            }else{
                tm.put(k,tm.get(k)+1);
            }
            x=x.next;
        }
    }
    ListNode head=null,temp=head;
    for(Map.Entry e:tm.entrySet()){
        k=(int)e.getValue();
        j=(int)e.getKey();
        if(head==null){
            head=new ListNode(j);
            temp=head;
            k--;
        }
        while(k-->0){
            temp.next=new ListNode(j);
            temp=temp.next;
        }
    }
    return head;
}



    public static void main(String[] args) throws IOException {
        ArrayList<ListNode> a=new ArrayList<ListNode>();
        a.add(new ListNode(1));
        a.get(0).next=new ListNode(10);
        a.get(0).next.next=new ListNode(20);
        
        a.add(new ListNode(4));
        a.get(1).next=new ListNode(11);
        a.get(1).next.next=new ListNode(13);
        
        a.add(new ListNode(3));
        a.get(2).next=new ListNode(8);
        a.get(2).next.next=new ListNode(9);
        System.out.println(sort(a));
        
        scanner.close();
    }
}
