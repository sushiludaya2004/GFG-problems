//https://www.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
/*  A Binary Tree nodea
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
class Tree{
   void find(Node node,ArrayList<Integer> ans){
    if(node==null)return;
    if(node.left==null && node.right!=null) ans.add(node.right.data);
    if(node.left!=null && node.right==null)ans.add(node.left.data);
     
    find(node.left, ans);
    find(node.right, ans);
    }
    
    ArrayList<Integer> noSibling(Node node){
        ArrayList<Integer> ans=new ArrayList<>();
        find(node, ans);
        Collections.sort(ans);
        
        if(ans.size()==0){
            ans.add(-1);
            return ans;
        }else  return ans;
        
    }
}
