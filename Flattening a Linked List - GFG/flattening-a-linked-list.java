

/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	    if(root.next == null){
	        return root;
	    }
	    Node head2 = flatten(root.next);
	    Node head1 = root;
	    Node temp = new Node(0);
	    Node res = temp;
	    
	    while(head1!=null && head2!=null ){
	        if(head1.data < head2.data){
	            temp.bottom = head1;
	            head1 = head1.bottom;
	        }
	        else{
	            temp.bottom = head2;
	            head2 = head2.bottom;
	        }
	        temp = temp.bottom;
	    }
	    if(head1 != null){
	        temp.bottom = head1;
	    }
	    else{
	        temp.bottom = head2;
	    }
	   
	    return res.bottom;
    }
}
