//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&category=Arrays,Linked%20List&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
       d = d % n;
       if(d == 0){
           return;
       }
       
       int[] temp = new int[d];
       for(int i = 0; i < d; i++){
           temp[i] = arr[i];
       }
        
       int start = 0;    
       for(int i = d; i < n; i++){
           arr[start] = arr[i];
           start++;
       }
       
       for(int i = 0; i < temp.length; i++){
           arr[start] = temp[i];
           start++;
       }
    }
}
