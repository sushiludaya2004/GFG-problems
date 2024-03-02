//https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node a, Node b) {
        Node temp = new Node(0);
        Node res = temp; 
        
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.next = a; 
                temp = temp.next; 
                a = a.next; 
            }
            else {
                temp.next = b;
                temp = temp.next; 
                b = b.next; 
            }
        }
        
        if(a != null) temp.next = a; 
        else temp.next = b;
        return res.next; 
   } 
}
