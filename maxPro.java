//https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long ans = Integer.MIN_VALUE;
        long prefix = 1, suffix = 1;
        for(int i = 0; i < n; i++){
            
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            
            prefix *= arr[i];
            suffix *= arr[n-1-i];
            ans = Math.max(ans, Math.max(prefix,suffix));
        }
        return ans;
    }
}
