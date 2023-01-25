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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        if(i!=null && j!=null)
        {
            if(i.val<j.val)
            {
                i.next=mergeTwoLists(i.next,j);
                return i;
            }
            else
            {
                j.next=mergeTwoLists(i,j.next);
                return j;
            }
        }
        if(j==null)return i;
        return j;
    }
}