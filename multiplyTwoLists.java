//https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1?page=1&category=Linked%20List&difficulty=Easy&status=unsolved&sortBy=submissions
/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long m = 1000000007;
          long n1 =0, n2=0;

          Node temp = l1;
          while(temp!=null){
              n1 = (n1*10)%m+temp.data;
              temp = temp.next;
          }
          temp = l2;
          while(temp!=null){
              n2 = (n2*10)%m + temp.data;
              temp = temp.next;
          }

          return (n1*n2) % m;
   }
}
