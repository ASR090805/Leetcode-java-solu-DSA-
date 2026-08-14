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

        ListNode newhead=head.next,slow=head,fast=head.next,prev=null;
        while(slow.next!=null && fast!=null){
            slow.next=fast.next;
            fast.next=slow;
            if(prev!=null){
                prev.next=fast;
            }
            prev=slow;
            if(slow.next==null){
                break;
            }
            else{
                slow=slow.next;
                fast=slow.next;
            }
        }
        return newhead;
    }
}