//https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        if(head.data == key) return true;
        Node temp = head;
        while(temp != null){
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}
