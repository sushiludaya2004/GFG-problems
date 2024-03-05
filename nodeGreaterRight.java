//https://www.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
class Solution {
    Node compute(Node head) {
        head = rev(head);
        int max = head.data;
        Node curr = head.next;
        Node prev = head;
        while( curr != null ){
            if(curr.data >= max){
                prev = curr;
                max = curr.data;
            }
            else prev.next = curr.next;
            
            curr = curr.next;
        }
        
        return rev(head);
        
    }
    
    Node rev(Node head){
        Node curr = head, prev = null, temp = null;
        while( curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
