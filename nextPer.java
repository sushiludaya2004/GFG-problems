//https://www.geeksforgeeks.org/problems/next-permutation5226/1
class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        int ind = -1;
        for(int i = N-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        
        if(ind == -1){
            reverse(arr, 0, N-1);
            
        }
        else {
        for(int i = N-1; i >= ind; i--){
            if(arr[i] > arr[ind]){
                swap(arr,i,ind);
                break;
            }
        }
         reverse(arr, ind + 1, N - 1);
        }
        
            
       
        List<Integer> result = new ArrayList<>();
        for (int value : arr) {
            result.add(value);
        }
        return result;
    }
    
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    } 
    
    static void reverse(int[] arr, int start, int end){
        
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
            
        }
    }
    
}
