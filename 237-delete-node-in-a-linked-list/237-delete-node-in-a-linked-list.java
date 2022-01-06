/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null){
            return;
        }
        //copy val to this node and point it to next.next
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}