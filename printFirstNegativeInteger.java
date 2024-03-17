//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1?page=1&category=sliding-window&sortBy=submissions
class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        long[] result = new long[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.offerLast(i);
            }
        }
        result[0] = queue.isEmpty() ? 0 : arr[queue.peekFirst()];

        for (int i = k; i < n; i++) {
            if (!queue.isEmpty() && queue.peekFirst() == i - k) {
                queue.pollFirst();
            }
            
            if (arr[i] < 0) {
                queue.offerLast(i);
            }
            
            result[i - k + 1] = queue.isEmpty() ? 0 : arr[queue.peekFirst()];
        }

        return result;
    }
}
