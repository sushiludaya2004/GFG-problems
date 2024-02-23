//https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&category=Linked%20List&sortBy=submissions
class Solution
{
    //Function to remove a loop in the linked list.
    // public static void removeLoop(Node head){
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //             slow = head;
    //             while(slow != fast){
    //                 slow = slow.next;
    //                 fast = fast.next;
    //                 if(slow.next == fast.next)  fast.next = null;
    //             }
    //             return;
    //         }
    //     }
    //     //return -1;
    // }
     public static void removeLoop(Node head){
       HashSet<Node> sp = new HashSet<>();
       
       Node ptr = head;
       Node prev = null ;
       while( ptr != null ){
           if(sp.contains(ptr)){
            prev.next = null;
            break;
               
           }else{
               sp.add(ptr);
           }
           
           prev = ptr;
           ptr = ptr.next;
       }
    }


}
