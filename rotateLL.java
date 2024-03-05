//https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // if(head == null || head.next == null) return head;
        
        // int len = 1;
        // int cnt = 1;
        // Node temp = head;
        // Node tail = head;
        // while(tail.next != null){
        //     len++;
        //     tail = tail.next;
        // }
        // tail.next = head;
        
        // k = k%len;
        // if(k == 0) return head;
        // while(temp != null){
        //     if(cnt == k) {
        //         head = temp.next;
        //         temp.next = null;
        //     }
        //     temp = temp.next;
        //     cnt++;
        // }
        // return head;
        
    // if(head == null||head.next == null||k == 0) return head;
    
    // Node temp = head;
    // int length = 1;
    // while(temp.next != null) {
    //     ++length;
    //     temp = temp.next;
    // }
 
    // temp.next = head;
    // k = k%length;
    // if(k == 0) return head;
    // int end = k; //to get end of the list
    // while(end--!=0) temp = temp.next;
    // //breaking last node link and pointing to NULL
    // head = temp.next;
    // temp.next = null;
    // return head;
    
    Node prev=null,curr=head;
        int i=0;
        while(i<k)
        {
             prev=curr;
            curr=curr.next;
            i++;
           
        }
        if(curr==null)return head;
        prev.next=null;
        Node t=curr;
        Node g=prev;
        while(t!=null)
        {
            g=t;
            t=t.next;
        }
        g.next=head;
        return curr;
    
    
     }

}
