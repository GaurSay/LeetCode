/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node curr = head;
        //linking linked list like map
        while(curr!=null){
            Node copy = new Node(curr.val);
            Node temp = curr.next;
            curr.next = copy;
            copy.next = temp;
            curr = temp;
        }
        
        //create deep clone
        Node temp = head;
        while(temp!=null){       
            Node rand = temp.random;          
            if(rand != null){
                temp.next.random = rand.next;  
            }        
            temp = temp.next.next;
        }
        Node ans = head.next;
        System.out.println(head.next.val+" ");
        
        
        // Third round: restore the original list, and extract the copy list.
        temp = head;
        while(temp!=null){
            Node copy = temp.next;
            temp.next = temp.next.next;
            if(temp.next !=null){
                copy.next = temp.next.next;
            }
            temp = temp.next;          
        }
        return ans;
    }
}