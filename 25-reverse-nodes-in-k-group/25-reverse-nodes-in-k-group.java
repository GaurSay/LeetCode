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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next==null ){
            return head;
        }
        int count = 1;
        ListNode h1 = head;
        ListNode t1 = head;
        while(count !=k && t1.next!=null){
           t1 = t1.next;
           count++;
        }
        // System.out.println(t1.val);
        // do this group
        if(count==k){
            ListNode h2 = t1.next;
            h2 = reverseKGroup(h2,k);
            t1.next = null;
            h1 = reverse(head);
            head.next = h2;
        }
        else{
            
        }
        
        return h1;
    }
    private static ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }
}