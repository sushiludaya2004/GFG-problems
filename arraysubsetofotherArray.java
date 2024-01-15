//https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
class Compute {
    public String isSubset( long arr1[], long arr2[], long m, long n) {
        int i = 0, j = 0;

		if (m < n)
			return "No";

		Arrays.sort(arr1); // sorts arr1
		Arrays.sort(arr2); // sorts arr2

// 		while (i < n && j < m) {
// 			if (arr1[j] < arr2[i])
// 				j++;
// 			else if (arr1[j] == arr2[i]) {
// 				j++;
// 				i++;
// 			}
// 			else if (arr1[j] > arr2[i])
// 				return "No";
// 		}
// 		if (i < n)
// 			return "No";
// 		else
// 			return "Yes";

        
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                i++;
            }
            
            else if(arr1[i] == arr2[j]) {
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                return "No";
            }
        }
        return "Yes";
    
	
	}


	


}
