//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
class Solution {
        
    static int search(int arr[], int N, int X) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }
    
}
