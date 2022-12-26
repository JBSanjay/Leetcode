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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }
        ListNode dummy=head;
        int count=0;
        int i=1;
        while(dummy!=null)
        {
            dummy=dummy.next;
            count++;
            // i++;
        }
        int len=count-n;
        if(n==count)
        {
            return head.next;
        }
        int temp=1;
        dummy=head;
        while(temp<len)
        {
            dummy=dummy.next;
            temp++;
        }
        dummy.next=dummy.next.next;
        return head;
        // if(dummy.next!=null)
        // {
        // dummy.next=dummy.next.next;
        // dummy.val=dummy.next.val;
        // }

        // int tcoun=0;
        // ListNode dummy1=head;
        // while(tcoun<(count-n+1) && dummy1.next!=null)
        // {
        //     dummy1=dummy1.next;
        //     tcoun++;
        // }
        // // if(dummy1.next!=null)
        // if(count>n)
        // {
        // dummy1.val=dummy1.next.val;
        // dummy1.next=dummy1.next.next;
        // }
        // else
        // {
        //     dummy1.next=null;
        // }
        // return head;
        
    }
}