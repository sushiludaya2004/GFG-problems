//https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1?page=2&category=Linked%20List&sortBy=submissions
class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
       Node dum = new Node(0);
       dum.next = head;
       
       Node temp = dum;
       
       while(temp.next != null && temp.next.next != null){
           Node s1 = temp.next;
           Node s2 = temp.next.next;
           
           s1.next = s2.next;
           s2.next = s1;
           
           temp.next = s2;
           temp = s1;
       }
       return dum.next;
       
    }
    
    
}
