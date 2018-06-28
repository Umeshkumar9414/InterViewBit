//Que :- https://www.interviewbit.com/problems/list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
    ListNode fast=a;
    ListNode slow=a;
    if(a==null || a.next==null){
        return null;
    }
    fast=fast.next.next;
    slow=slow.next;
    boolean exist=false;
    
    while(fast!=null && slow !=null && fast.next!=null){
       // System.out.println(slow.val+" "+fast.val);
        if(slow==fast){
            exist=true;
            break;
        }
        slow=slow.next;
        fast=fast.next.next;
    }
    if(!exist){
        return null;
    }
    fast=a;
    while(fast!=slow){
        fast=fast.next;
        slow=slow.next;
    }
    return fast;
    
    
    }
}
