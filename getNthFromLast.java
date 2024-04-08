//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	 int count = 0;
       Node temp = head;
       while(temp.next!=null){
           count++;
           temp=temp.next;
       }
       
       n=count-n+1;
       
       if(n<0) return -1;
       
       while(n!=0){
           head = head.next;
           n--;
       }
       
       return head.data;	
    }
}
