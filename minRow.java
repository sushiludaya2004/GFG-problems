//https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1
class Solution {
    int minRow(int n, int m, int a[][]) {
        int min = Integer.MAX_VALUE;
        
        int index = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = 0; j<m; j++){
                sum = sum + a[i][j];
            }
            if(sum < min){
                min = sum;
                index = i;
            } 
        }
        return index+1;
    }
}
