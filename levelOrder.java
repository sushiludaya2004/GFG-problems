//https://www.geeksforgeeks.org/problems/level-order-traversal/1?page=1&category=Tree&sortBy=submissions
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
           Node n=Q.remove();
           al.add(n.data);
           if(n.left!=null)
           Q.add(n.left);
           if(n.right!=null)
           Q.add(n.right);
        }
        return al;
    }
}
