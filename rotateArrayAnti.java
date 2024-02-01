//https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) {
    int[][] arr = new int[n][n];
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            arr[n-1-j][i] = matrix[i][j];
        }
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = arr[i][j];
        }
    }
}
