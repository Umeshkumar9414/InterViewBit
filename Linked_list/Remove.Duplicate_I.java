// Que:- https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
         if(a==null){
            return a;
        }
        int last=a.val;
        ListNode ln=a,head=a;
        a=a.next;
        while(a!=null){
            if(a.val!=last){
                ln.next=a;
                ln=a;
                last=a.val;
            }
            a=a.next;
        }
        ln.next=null;
        return head;
    }
}
