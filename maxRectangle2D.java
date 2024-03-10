//https://www.geeksforgeeks.org/problems/max-rectangle/1?page=1&category=Stack&sortBy=submissions
class Solution {
   public int maxArea(int M[][], int n, int m) {
    int maxArea = 0;
    int[] height = new int[m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (M[i][j] == 1) height[j]++;
            else height[j] = 0;
        }
        int area = maxArea(height, m);
        maxArea = Math.max(maxArea, area);
    }
    return maxArea;
}

public int maxArea(int[] histo, int n) {
    Stack<Integer> st = new Stack<>();
    int maxA = 0;
    for (int i = 0; i <= n; i++) {
        while (!st.isEmpty() && (i == n || histo[st.peek()] >= histo[i])) {
            int height = histo[st.peek()];
            st.pop();
            int width;
            if (st.isEmpty())
                width = i;
            else
                width = i - st.peek() - 1;
            maxA = Math.max(maxA, width * height);
        }
        st.push(i);
    }
    return maxA;
}

}
