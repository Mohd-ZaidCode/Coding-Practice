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
    public ListNode mergeNodes(ListNode head) {
       ListNode el=head;
       ListNode temp=head.next;
       int sum=0;
       while(temp!=null){
        while(temp.val!=0){
            sum+=temp.val;
            temp=temp.next;
            }
        System.out.println("test");
        el.val=sum;
        if(temp.next==null){el.next=null;break;}
        el.next=temp;
        el=temp;
        temp=temp.next;
        sum=0;
       }
       return head;
    }
}