// Que :-https://www.interviewbit.com/problems/reorder-list/

//  Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 
public class Solution {
    public static void print(ListNode a){
        while(a!=null){
            System.out.print(a.val+"--> ");
            a=a.next;
        }
        System.out.println();
    }
    public static ListNode reverse(ListNode a) {
        ListNode back=null,next=null;
        while(a!=null){
            next=a.next;
            a.next=back;
            back=a;
            a=next;
        }
        return back;
    }
    public static ListNode deleteDuplicates(ListNode a) {
        ListNode hare=a.next;
        ListNode tor=a,next,next2;
        if(a==null){
            return null;
        }
        while(hare!=null && hare.next!=null){
           hare=hare.next.next;
            tor=tor.next;
        }
        ListNode n1=a;
        ListNode n2=tor.next;
        tor.next=null;
        n2=reverse(n2);
        print(n1);
        print(n2);
        while(n2!=null && n1!=null){
            next=n1.next;
            next2=n2.next;
            n1.next=n2;
            n2.next=next;
            n1=next;
            n2=next2;
            // System.out.println("linked ");
            // print(n1);
            // print(n2);
            // print(next);
        }
        return a;        
    }
    public static void main(String []arg){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
       // head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next=null;
        print(deleteDuplicates(head));
        
    }
}
