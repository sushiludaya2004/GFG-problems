//https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution{
    
    public static int lenOfLongSubarr (int a[], int n, int k) {
        // works only for positive
        // int left = 0, right = 0; 
        // long sum = a[0];
        // int maxLen = 0;
        // while (right < n) {
        //     while (left <= right && sum > k) {
        //         sum -= a[left];
        //         left++;
        //     }
        //     if (sum == k) {
        //         maxLen = Math.max(maxLen, right - left + 1);
        //     }

        //     right++;
        //     if (right < n) sum += a[right];
        // }

        // return maxLen;
       

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            
            sum += a[i];

            
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

}
