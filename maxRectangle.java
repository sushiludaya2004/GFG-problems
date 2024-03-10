class Solution
{
    // //Function to find largest rectangular area possible in a given histogram.
    //https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1?page=1&category=Stack&sortBy=submissions
    public static long getMaxArea(long heights[], long n) 
    {
        // long maxA = 0;
        // Stack < Long > st = new Stack < > ();
        // long[] leftSmall = new long[(int)n];
        // long[] rightSmall = new long[(int)n];
        // for (long i = 0; i < n; i++) {
        //     while (!st.isEmpty() && heights[st.peek().intValue()] >= heights[(int)i]) {
        //         st.pop();
        //     }
    
        //     if (st.isEmpty()) leftSmall[(int)i] = 0;
        //     else leftSmall[(int)i] = st.peek() + 1;
        //     st.push(i);
        // }
    
        // // clear the stack to be re-used
        // st.clear();
    
        // for (long i = n - 1; i >= 0; i--) {
        //     while (!st.isEmpty() && heights[st.peek().intValue()] >= heights[(int)i]) {
        //         st.pop();
        //     }
    
        //     if (st.isEmpty()) rightSmall[(int)i] = n - 1;
        //     else rightSmall[(int)i] = st.peek() - 1;
        //     maxA = Math.max(maxA, heights[(int)i] * (rightSmall[(int)i] - leftSmall[(int)i] + 1));
        //     st.push(i);
        // }
    
        // // long maxA = 0;
        // // for (long i = 0; i < n; i++) {
        // //     maxA = Math.max(maxA, heights[(int)i] * (rightSmall[(int)i] - leftSmall[(int)i] + 1));
        // // }
        // return maxA;
        
        
        
        
        Stack <Integer> st = new Stack<>();
        long maxA = 0; // Change to long
        
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])) {
                long height = heights[st.peek()];
                st.pop();
                long width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;

    }

}
