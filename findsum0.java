//https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1?page=1&category=sliding-window&sortBy=submissions
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
       for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0) {
                return true;
            }
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;


    }
}
