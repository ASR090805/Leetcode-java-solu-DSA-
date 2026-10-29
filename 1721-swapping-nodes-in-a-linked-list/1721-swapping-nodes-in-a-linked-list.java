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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode n1=head;
        int i=0;
        while(i<k-1){
            n1=n1.next;
            i++;
        }
        ListNode n=n1;
        ListNode n2=head;
        while(n.next!=null){
            n2=n2.next;
            n=n.next;
        }
        int temp=n1.val;
        n1.val=n2.val;
        n2.val=temp;
        return head;
    }
}