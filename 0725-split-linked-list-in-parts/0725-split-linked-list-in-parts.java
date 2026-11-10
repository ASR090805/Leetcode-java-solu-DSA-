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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        ListNode[] res= new ListNode[k];
        int ele=len/k;
        int rem=len%k;
        ListNode temp=head;
        ListNode prev=null;
        curr=head;
        for(int i=0;i<k;i++){
            int count=ele;
            if(rem>0){
                count++;
                rem--;
            }
            int counter=0;
            while(counter<count){
                prev=curr;
                curr=curr.next;
                counter++;
            }
            if(prev!=null){
                prev.next=null;
            }
            res[i]=temp;
            temp=curr;
        }
        return res;
    }
}