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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        return reverse(head);
        
    }
    private static ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode smallhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return smallhead;
    }
}