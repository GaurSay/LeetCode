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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c= 0;
        int sum =0;
        ListNode ans = new ListNode(0);
        ListNode temp = ans; 
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val +c;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            c = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            sum = l1.val +c;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            c = sum/10;
            l1 = l1.next;
        }

        while(l2!=null){
            sum = l2.val +c;
            ans.next = new ListNode(sum%10);
            ans = ans.next;
            c = sum/10;
            l2 = l2.next;
        }

        if(c>0){
            ans.next = new ListNode(c);
        }

        return temp.next;
    }
}