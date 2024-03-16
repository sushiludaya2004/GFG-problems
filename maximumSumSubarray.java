
//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        
        long max_sum = Long.MIN_VALUE;
        long curr = 0;
        long cnt = 0;
        for (int i = 0; i < n;i++) {
            if (cnt >= k) {
                curr = curr - arr.get(i - k);
                cnt--;
            }
            curr = curr + arr.get(i);
            cnt++;

            max_sum = Math.max(curr, max_sum);
        }

        return max_sum;
        
        // long maxSum = 0;
        // long currSum = 0;
    
        // // Calculate sum of first k elements
        // for (int i = 0; i < k; i++) {
        //     currSum += arr.get(i);
        // }
    
        // maxSum = currSum;
    
        // // Calculate sum of remaining elements by sliding the window
        // for (int i = k; i < arr.size(); i++) {
        //     currSum += arr.get(i) - arr.get(i - k);
        //     maxSum = Math.max(maxSum, currSum);
        // }
    
        // return maxSum;
    }
}
