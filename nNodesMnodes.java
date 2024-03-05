//https://www.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1?page=3&category=Linked%20List&sortBy=submissions
class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        int cnt;
        Node curr = head;
        Node t = new Node(0);
        while(curr != null){
            for(cnt = 1; cnt<M && curr != null; cnt++){
                curr = curr.next;
            }
            if(curr == null) return;
            t = curr.next;
            for(cnt = 1; cnt<=N && t!= null; cnt++){
                Node temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
        
    }
}
