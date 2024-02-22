//https://www.geeksforgeeks.org/problems/find-length-of-loop/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return length(slow, fast);
        }
        return 0;    
    
    }
    
    public static int length(Node slow, Node fast){
        int cnt = 1;
        slow = slow.next;
        while(slow!=fast){
            cnt++;
            slow = slow.next;
        }
        return cnt;
    }
}
