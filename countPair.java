//https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1?page=2&category=Linked%20List&sortBy=submissions
class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : head2)set.add(i);
        for(int i : head1){
            int val = x-i;
            if(set.contains(val))count++;
        }
        return count;
    }
}
