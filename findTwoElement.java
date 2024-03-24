//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&category=Arrays&difficulty=Medium&status=unsolved&sortBy=submissions
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // Set<Integer> set = new HashSet<>();
        // int re = -1;
        // int sum = 0;
        // // for(int i : arr){
        // //     if(!set.add(arr[i])) re = arr[i];
        // // }
        
        // for(int i = 0; i<N; i++){
        //     if(!set.add(arr[i])) re = arr[i];
        //     else sum += arr[i];
        // }
        
        // int n = (N * (N+1))/2;
        // // for (int value : set) {
        // //     sum += value;
        // // }
        // int miss = Math.abs(n -sum);
        
        // return new int[]{re,miss};
        
        
        int[] result = {-1, -1};
        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++)
            a[arr[i]]++;

        for (int i = 1; i <= n; i++) {
            if (a[i] > 1)
                result[0] = i;
            if (a[i] == 0)
                result[1] = i;
        }
        
        return result;
    }
}
