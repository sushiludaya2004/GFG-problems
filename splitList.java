//https://www.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1?page=1&category=Linked%20List&difficulty=Easy&status=unsolved&sortBy=submissions
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
        // Function  to split a circular LinkedList
        void splitList(circular_LinkedList list)
        {
             //DO NOT REMOVE THESE 3 LINES
             Node head=list.head;
             Node head1=null;
             Node head2=null;
             
             // checking if the list is empty or has only one node
             if(head == null || head.next==head){
                 list.head1=head;
                 list.head2=null;
                 return;
             }
             //finding the middle node using Hare-Tortoise Algorithm
             Node slow = head;
             Node fast = head;
             while(fast.next!=head && fast.next.next!=head){
                 slow = slow.next;
                 fast=fast.next.next;
             }
             
             // if num of node is odd move the slow pointer one step forward
             if(fast.next.next==head){
                 fast=fast.next;
             }
             
             // Split the list and adjust pointers
             head1=head;
             head2=slow.next;
             
             // make both list circular
             slow.next=head1;
             fast.next=head2;
             //DO NOT REMOVE THESE 2 LINES
             list.head1=head1;
             list.head2=head2;
     }
}
