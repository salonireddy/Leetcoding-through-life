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
        if(head==null || head.next==null){
            return null;
        }
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        if(n==size)
            return head.next;
        int pos = size-n;
        curr = head;
        while(pos>1){
            curr=curr.next;
            pos--;
        }
        curr.next = curr.next.next;
        return head;
    }
}