//https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
class Solution {
    int transitionPoint(int arr[], int n) {
        int low = 0;
        int high = n-1;
        int mid = -1;
        while(low <= high){
            mid= (low + high) / 2;
            if(arr[mid] == 1) high = mid -1;
            else if(arr[mid] < 1) low = mid + 1;
        }
        if(low == n) return -1;
        return low;
    }
}
