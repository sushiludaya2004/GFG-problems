
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=1&category=Stack&sortBy=submissions
class Solution {
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> stack = new Stack<>();
        long[] nextLargestArray = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            nextLargestArray[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return nextLargestArray;
    } 
}
