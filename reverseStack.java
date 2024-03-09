//https://www.geeksforgeeks.org/problems/reverse-a-stack/1?page=2&category=Stack&sortBy=submissions
class Solution
{ 
    static void reverse(Stack<Integer> st)
    {
      if(st.isEmpty()){
          return;
      }  
      int temp = st.pop();
      reverse(st);
      insertLast(st, temp);
    }
    
    static void insertLast(Stack<Integer> temp, int ele){
        if(temp.isEmpty()){
            temp.push(ele);
            return;
        }
        int top = temp.pop();
        
        insertLast(temp, ele);
        
        temp.push(top);
    }
}
