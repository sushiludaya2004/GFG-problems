//https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
        Node slow = head;
         Node fast = head;
         
        if(head.next==null)
            return head.data;
         
         while(fast.next!=null && fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
         }
         
         if(fast.next==null)        //if odd no. of nodes are there
            return slow.data;
        else
            return slow.next.data;      // if even no. of nodes are there
    }
}
