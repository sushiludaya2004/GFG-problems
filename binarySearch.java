//https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?page=1&category=Binary%20Search&sortBy=submissions
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        int start = 0;
        int end = N-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (K < arr[mid]) {
                end = mid - 1;
            } else if (K > arr[mid]){
                start = mid + 1;
            }else{
                return 1;
            }
        }
        return -1;        
    
    
    }
}
