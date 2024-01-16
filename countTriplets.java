//https://www.geeksforgeeks.org/problems/count-the-triplets4615/1
class Solution {
    int countTriplet(int arr[], int n) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = n-1; i>0; i-- ){
            int low = 0;
            int high = i-1;
            while(low < high){
                int sum = arr[low] + arr[high];
                if(sum == arr[i]){
                  count++;
                  low++;
                  high--;
                } 
                else if(sum > arr[i]) high--;
                else low++;
            }
        }
        return count;
    }
}
