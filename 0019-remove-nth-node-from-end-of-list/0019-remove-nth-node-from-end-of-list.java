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
        if(n==0) return head;
        int count=0;
        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(n==count){
            return head.next;
        }
        temp=head;
        int i=0;
        while(i<count-n){
            prev=temp;
            temp=temp.next;
            i++;
        }
        // delete part
        prev.next=temp.next;
        return head;
    }
}