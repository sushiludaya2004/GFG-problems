//https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&status=unsolved&sortBy=submissions
/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	    if (head == null || head.next == null)
            return head; 
        
        if (x == 1) 
        {
            return head.next; 
        }
        
        Node temp = head;
        
        for(int i = 1; i < x-1; i++)
        {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}
