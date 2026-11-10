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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode nh=head.next;
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && slow.next!=null){
            ListNode temp=slow;
            fast=slow.next;
            slow.next=fast.next;
            fast.next=slow;
            slow=slow.next;
            if(slow!=null && slow.next!=null){
                temp.next=slow.next;
            }

        }
        return nh;
    }
}