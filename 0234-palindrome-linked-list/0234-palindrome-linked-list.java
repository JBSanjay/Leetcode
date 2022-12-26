/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode dummy=null;
      ListNode le=head;
      ListNode mid=head;
       while(le!=null && le.next!=null)
       {
           le=le.next.next;
           mid=mid.next;
        }
        
        ListNode rev=null;
        while(mid!=null)
        {
             ListNode next=mid.next;
            mid.next=dummy;
            dummy=mid;
            mid=next;
        }
        // System.out.print(mid);
        while(head!=null && dummy!=null)
        {
            if(head.val!=dummy.val)
            {
                return false;
            }
            head=head.next;
            dummy=dummy.next;
        }
        return true;
    }
}