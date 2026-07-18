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
        if(head==null||head.next==null)return head;
        ListNode i=head;
        ListNode j=head.next;
        while(i!=null &&j!=null){
            int temp=i.val;
            i.val=j.val;
            j.val=temp;
            i=j.next;
            if(i==null)return head;
            j=i.next;
        }
     return head;   
    }
}