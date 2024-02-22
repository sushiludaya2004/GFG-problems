//https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
    //     Node temp = head;
    //     Map< Node , Integer > nodeMap = new HashMap<>();
    //     while(temp != null){
    //         if(nodeMap.containsKey(temp)) return true;
    //         nodeMap.put(temp,1);
    //         temp = temp.next;
    //     }
    //     return false;
    // }
    
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) return true;
    }
    return false;
    }
