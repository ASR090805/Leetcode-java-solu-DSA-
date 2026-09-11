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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int i=0,j=-1;
        int dir=1;
        int[][] result=new int[m][n];
        while(m>0 && n>0){
            for(int k=0;k<n;k++){
                j+=dir;
                if(head!=null){
                result[i][j]=head.val;
                head=head.next;}
                else{
                    result[i][j]=-1;
                }
            }
            m--;
            for(int k=0;k<m;k++){
                i+=dir;
                if(head!=null){
                result[i][j]=head.val;
                head=head.next;}
                else{
                    result[i][j]=-1;
                }
            }
            n--;
            dir*=-1;
        }
        return result;
    }
}