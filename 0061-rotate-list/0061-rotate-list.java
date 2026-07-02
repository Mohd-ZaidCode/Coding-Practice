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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        ListNode tempHead=head;
        ListNode temptail=head;
        int size=1;
        while(temptail.next!=null){
            temptail=temptail.next;
            size++;
        }
        k=k%size;
        temptail.next=head;
        for(int i=1;i<size-k;i++){
            tempHead=tempHead.next;
        }
        head=tempHead.next;
        tempHead.next=null;

        return head;
    }
}