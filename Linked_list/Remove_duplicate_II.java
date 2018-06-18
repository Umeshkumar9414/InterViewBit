/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public static void print(ListNode a){
        while(a!=null){
            System.out.print(a.val+"--> ");
            a=a.next;
        }
        System.out.println();
    }
    public ListNode deleteDuplicates(ListNode a) {
         if(a==null){
            return a;
        }
        ListNode ln,head=null,back=null;
        boolean rep=false;
        ln=a;
        int last=a.val;
        a=a.next;
        while (a!=null) {
            
            if(a.val!=last){
              //  System.out.println("not equal "+a.val+" "+last+" "+rep);
                if(rep){
                    last=a.val;
                }else{
                    if(back==null){
                        head=ln;
                        back=head;
                    }else{
                       // System.out.println("adding at "+back.val);
                        back.next=ln;
                        back=ln;
                     }//System.out.println("head ");
                    // print(head);
                    
                }
                rep=false;
            }else{
                rep=true;
            }
            ln=a;
            last=a.val;
            a=a.next;
            
            // System.out.println("now ln");
            // print(ln);
        }
        if(!rep){
             if(back==null){
                        head=ln;
                        back=head;
                    }else{
                      //  System.out.println("adding at "+back.val);
                        back.next=ln;
                        back=ln;
                    }
        }else{
            if(back!=null)
            back.next=null;
        }
        
        return head;
    }
}
