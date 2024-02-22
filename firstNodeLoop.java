//https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1
class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        // Node temp = head;
        // Map< Node , Integer > nodeMap = new HashMap<>();
        // while(temp != null){
        //     if(nodeMap.containsKey(temp)) return temp.data;
        //     nodeMap.put(temp,1);
        //     temp = temp.next;
        // }
        // return -1;
        
        Node slow = head;
        Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }
    return -1;
    
    }
}
