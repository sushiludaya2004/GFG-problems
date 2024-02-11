//https://www.geeksforgeeks.org/problems/binary-matrix-having-maximum-number-of-1s--170647/1?page=2&category=Binary%20Search&sortBy=submissions
class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        int[] arr = {-1,-1};
        
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                count += mat[i][j];
            }
            if(count > arr[1]){
                arr[0] = i;
                arr[1] = count;
            }
        }
        return arr;
    }
    
    
};
