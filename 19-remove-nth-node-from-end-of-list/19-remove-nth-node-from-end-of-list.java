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
        if(head==null){
            return head;
        }
        int t =n;
        ListNode prev = null;
        ListNode temp = head;
        ListNode curr = head;
        while(n>0){
            curr = curr.next;
            n--;
        }
        while(curr!=null){
            prev = temp;
            temp = temp.next;
            curr = curr.next;
        }
        if(prev == null){
            return head.next;
        }
        prev.next = temp.next;
        // System.out.println(prev.val+" "+temp.val);
        return head;
        
    }
}