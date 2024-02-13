//https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1?page=2&category=Binary%20Search&sortBy=submissions
class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        if (D > N)
            return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        
        for (int num : arr) {
            high += num; 
            low = Math.max(low, num); 
        }

        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ss = countSum(arr, mid);
            if (ss > D) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    
    static int countSum(int[] arr, int sum) {
        int n = arr.length;
        int sumC = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= sum) {
                pagesStudent += arr[i];
            } else {
                sumC++;
                pagesStudent = arr[i];
            }
        }
        return sumC;
    }
};
