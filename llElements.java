/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
//https://www.geeksforgeeks.org/problems/print-linked-list-elements/1?page=1&category=Linked%20List&difficulty=School,Basic&sortBy=submissions
class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            
        }
        
    }
}
