//https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?page=1&category=Linked%20List&sortBy=submissions
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head==null || head.next==null)return head;
        
        Node d0=new Node(-1);
        Node zero=d0;
        
        Node d1=new Node(-1);
        Node one=d1;
        
        Node d2=new Node(-1);
        Node two=d2;
        
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                zero.next = temp;
                zero=zero.next;
            }
            else if(temp.data==1)
            {
                one.next=temp;
                one=one.next;
            }
            if(temp.data==2)
            {
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        
        zero.next = (d1.next != null) ? d1.next : d2.next;

        one.next=d2.next;
        two.next=null;
        
        Node newhead=d0.next;
        
        
        return newhead;
    }
}
