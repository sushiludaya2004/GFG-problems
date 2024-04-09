//https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	        if(head==null){
                return null;
            }
            Node temp = head;
             
            while(temp!=null){
                 if(temp.next!=null && temp.data == temp.next.data){
                     Node nodeToDelete = temp.next;
                     temp.next = temp.next.next;
                     nodeToDelete.next = null;
                 }
                 else{
                     temp = temp.next;
                 }
            }
            return head;	
    }
}
