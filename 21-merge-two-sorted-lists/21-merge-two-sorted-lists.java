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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1,list2);
    }
    private static ListNode merge(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = merge(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = merge(l1, l2.next);
        }
        return mergeHead;
//         ListNode anshead = null;
//         if(list1.val <= list2.val){
//             anshead = list1;
//             list1= list1.next;
//         }
//         else{
//             anshead = list2;
//             list2=list2.next;
//         }
//         ListNode curr = anshead;
//         while(list1!=null && list2!=null){
//             if(list1.val <= list2.val){
//                 curr.next = list1;
//                 list1= list1.next;
                
//              }
//             else{
//                 curr.next = list2;
//                 list2=list2.next;
//             }
//             curr = curr.next;
//         }
//         if(list1!=null){
//             curr.next = list1;
//         }
//         if(list2!=null){
//              curr.next = list2;
//         }
        
//         return anshead;
    }
}