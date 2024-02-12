//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {

   
    public static int findPages(int[] A, int N, int M) {
        if (M > N)
            return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        
        for (int num : A) {
            high += num; 
            low = Math.max(low, num); 
        }

        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(A, mid);
            if (students > M) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    static int countStudents(int[] arr, int pages) {
        int n = arr.length;
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

   
};
