//https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=1&category=Arrays&difficulty=Medium&status=unsolved&sortBy=submissions
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int count=0;
        int max=0;
        int index=-1;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1)count++;
            }
            if(count>max){
               max=count;
                index=i;
            }
          
        }
        return index;
    }
}
