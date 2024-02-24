//https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1?page=1&category=Linked%20List&sortBy=submissions
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node curr = head1;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = head2;
        
        Node slow= head1;
        Node fast = head1;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(slow != fast)
            return -1;
        slow = head1;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
	}
}
