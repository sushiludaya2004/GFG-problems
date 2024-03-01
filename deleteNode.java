//https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&category=Linked%20List&sortBy=submissions
//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         del.data = del.next.data;
         del.next = del.next.next;
    }
}
