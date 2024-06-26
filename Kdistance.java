//https://www.geeksforgeeks.org/problems/k-distance-from-root/1
/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> ans = new ArrayList<>();
          int dist = 0;
          find(root, k, dist, ans);
          return ans;
     }
     public void find(Node root, int k, int dist, ArrayList<Integer> ans){
        if(root == null)return;
        if(k == dist){
            ans.add(root.data);
            return;
        }
        dist++;
        find(root.left, k, dist, ans);
        find(root.right, k, dist, ans);
     }
}
