//https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        first = reverseList(first);
        second = reverseList(second);
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while(first != null){
            int sum = 0;
            if(first != null){
                sum += first.data;
                first = first.next;
            }
            
            sum += carry;
            carry = sum / 10;
            Node noo = new Node(sum % 10);
            temp.next = noo;
            temp = temp.next;
        }
        dummy = reverseList(dummy.next);
        return dummy;
    }
    
    
    public static Node reverseList(Node head)
    {
        
        if(head == null || head.next == null) return head;
        Node newHead = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
