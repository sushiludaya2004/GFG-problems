//https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    int findKRotation(int arr[], int n) {
        return findPivot(arr, n);
        
    }
    
    static int findPivot(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid+1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
