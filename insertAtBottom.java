//https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> s = new Stack<>();
        if(st.empty()){
            st.push(x);
            return st;
            
        }
        
        while(!st.empty()){
            s.push(st.pop());
        }
        
        st.push(x);
        
        while(!s.empty()) st.push(s.pop());
        
        return st;
    }
}

