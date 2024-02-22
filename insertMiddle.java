//https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=2&category=Linked%20List&sortBy=submissions
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node front = new Node(data);
        front.next = slow.next;
        slow.next = front;
        return head;
        
    }
    
    
}
