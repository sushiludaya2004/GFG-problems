//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
     boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

}
