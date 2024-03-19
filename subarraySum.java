//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=sliding-window&sortBy=submissions
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int start = 0;
        int end = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;

        while (end < n) {
            sum = sum + arr[end];

            while (sum > s && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == s && start <= end) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }

            end++;
        }

        ans.add(-1);
        return ans;
    }
}
