//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// User function Template for Java

// class Solution {
//     int missingNumber(int arr[], int n) {
//         // int i;
//         // for( i=1; i<=n; i++){
//         //     int count = 0;
//         //     for(int j = 0; j < n-1; j++){
//         //         if(arr[j] == i){ count ++;}
//         //     }
//         //     if(count == 0)
//         //         return i;
//         // }
//         // return -1;
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             sum = sum + arr[i];
//         }
//         return ((n * (n+1))/2 - sum);
//     }
// }
class Solution {
    int missingNumber(int arr[], int n) {
        int sum = 0;

       
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
        }

        int expectedSum = (n * (n + 1)) / 2;

        return expectedSum - sum;
    }
}
