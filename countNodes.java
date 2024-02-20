class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/
//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=1&category=Linked%20List&difficulty=School,Basic&sortBy=submissions
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
        
    }
    
    // private static Node conuntLL(int[] arr){
    //     Node head = new Node(arr[0]);
    //     Node mover = head;
    //     for(int i = 1; i < arr.length; i++){
    //         Node temp = new Node(arr[i]);
    //         mover.next = temp;
    //         mover = temp;
    //     }
    //     return head;
    // }
    
    // static int count(Node head){
    //     int count = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     return count;
    // }
}
