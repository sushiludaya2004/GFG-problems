//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1&category=Linked%20List&sortBy=submissions
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // Node temp = head;
        // Node prev = null;
        // while(temp != null){
        //     Node front = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = front;
        // }
        // return prev;
        
        if(head == null || head.next == null) return head;
        Node newHead = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
