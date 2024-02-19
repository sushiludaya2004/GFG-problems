//https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty=Basic&sortBy=submissions
class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == k) return mid;
            else if (arr[mid] >= k) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
