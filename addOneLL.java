//https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        int carry = helper(head);
        if(carry == 1){
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
            
        }
        return head;
    }
    
    public static int helper(Node temp){
        int carry = 0;
        if(temp == null) return 1;
        carry = helper(temp.next);
        temp.data = temp.data + carry;
        if(temp.data < 10) return 0;
        temp.data = 0;
        return 1;
    }
        
}
