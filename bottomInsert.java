//https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1?page=4&category=Stack&sortBy=submissions
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();
        while(!st.empty()) 
            temp.push(st.pop());
        st.push(x);
        
        while(!temp.isEmpty())
            st.push(temp.pop());
        return st;
    }
}
