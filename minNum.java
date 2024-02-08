//https://www.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1?page=1&category=Binary%20Search&sortBy=submissions
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        return findPivot(arr, low, high);
    }
    
    static int findPivot(int[] arr, int start, int end) {
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid+1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[0];
    }
}
