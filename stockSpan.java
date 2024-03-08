//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?page=1&category=Stack&sortBy=submissions
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[] span=new int[n];
        // Stack<Integer> st=new Stack<>();
        // span[0]=1;
        // st.push(0);
        // for(int i=0;i<n;i++){
        //     while(st.size()!=0 && price[i]>=price[st.peek()]){
        //         st.pop();
        //     }
        //     if(st.size()==0){
        //         span[i]=i+1;
        //     }else{
        //         span[i]=i-st.peek();
        //     }
        //     st.push(i);
        // }
        // return span;
        
        span[0] = 1;
        for(int i = 1; i<n; i++){
            int cnt = 0;
            for(int j = i; j>=0; j--){
            
            if(price[i] >= price[j]) cnt++;
            else break;
            }
            span[i] = cnt;
        }
        return span;
    }
    
}
