//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&difficulty=Easy&sortBy=submissions
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max = -1;
        int secMax = -1;
        for(int i = 0; i<n; ++i){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
                
            }
            else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
