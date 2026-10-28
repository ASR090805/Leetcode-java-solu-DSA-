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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode prev=null;
        ListNode curr=head;
        int i=0;
        while(i<left-1 && curr!=null){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode last=prev;
        ListNode next=head;
        i=0;
        while(i<(right-left+1) && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        if(last!=null){
            ListNode last2=last.next;
            last2.next=next;
            last.next=prev;
        }
        else{
            head.next=next;
            head=prev;
        }
        
        return head;
    }
}