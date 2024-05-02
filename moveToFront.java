//https://www.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&status=unsolved&sortBy=submissions
/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }
        
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        Node last = curr.next;
        last.next = head;
        curr.next = null;
        return last;
    }
}
        
