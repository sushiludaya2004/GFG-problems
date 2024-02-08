//https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
class Solution
{
    int findMin(int arr[], int n)
    {
        return findPivot(arr, n);
    }
    
    static int findPivot(int[] arr, int n) {
        int start = 0;
        int end = n -1;
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
