/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/
//https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1?page=1&category=Linked%20List&sortBy=submissions
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
	    
	   // Node t1 = head1;
	   // Node t2 = head2;
	    
	   // while( t1 != t2 ){
	   //     t1 = t1.next;
	   //     t2 = t2.next;
	   //    // if(t1 == t2) return t1.data;
	   //     if(t1 == null) t1 = head2;
	   //     if(t2 == null) t2 = head1;
	   // }
	   
	   //if(t1 == null || t2 == null) return -1;
	   //return t1.data;
	   
	Node d1 = head1;
    Node d2 = head2;
    
    while(d1 != d2) {
        d1 = d1 == null? head2:d1.next;
        d2 = d2 == null? head1:d2.next;
    }
    if (d1 == null || d2 == null)
            return -1;
    
    return d1.data;
}
}
