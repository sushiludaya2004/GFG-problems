//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1?page=1&category=Queue&sortBy=submissions
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
          int n=q.size()-k;
          Stack<Integer> st=new Stack<>();
          while(k>0){
              st.push(q.poll());
              k--;
          }
          while(!st.isEmpty()){
              q.add(st.pop());
          }
            while(n>0){
                
                q.add(q.poll());
                n--;
            }
            return q;
    }
}
