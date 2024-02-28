//https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?page=1&category=doubly-linked-list&difficulty=Easy&sortBy=submissions
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Node left = head;
        Node right = head;
        while(right.next != null) right = right.next;
        
        while(left.data < right.data){
            int num1 = left.data;
            int num2 = right.data;
            if(num1+num2 == target){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(num1);
                pair.add(num2);
                arr.add(pair);
                left = left.next;
                right = right.prev;
            }else if ( num1 + num2 > target){
                right = right.prev;
            }else{
                left = left.next;
            }
            
        }
        return arr;
    }
}
