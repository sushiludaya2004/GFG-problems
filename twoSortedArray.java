//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        // Ensure arr1 is the smaller array for simplicity
        if (n > m) {
            return kthElement(arr2, arr1, m, n, k);
        }

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = k - mid1;

            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;

            int r1 = (mid1 < n) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < m) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return -1;
    }
}
