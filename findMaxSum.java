//https://www.geeksforgeeks.org/problems/maximum-sum-of-hour-glass3842/1
class Solution {
    // int findMaxSum(int n, int m, int mat[][]) {
    //   if(n < 3 || m < 3) return -1;

    //     int sum = 0;
    //     for (int j = 0; j < m; j++) {
    //         sum += mat[0][j];
    //     }
    //     for (int j = 0; j < m; j++) {
    //         sum += mat[n - 1][j];
    //     }

    //     int i = 0;
    //     int j = (int) Math.ceil(m/2);
    //     for ( i = 1; i < n-1; i++) {
    //         //j = m/2;
    //         sum += mat[i][j];
    //     }
    //     return sum;
    // }
    
    int findMaxSum(int n, int m, int mat[][]) {
        
        int max = Integer.MIN_VALUE;
        if(n <= 2 || m <= 2){
            return -1;
        } 

        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < m - 2; j++){
                int sum = mat[i][j] + mat[i][j + 1] + mat[i][j + 2] + mat[i + 1][j + 1] + mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2];

                max = Math.max(max, sum);
            }
        }

        return max;
    }

};
