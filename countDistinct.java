//https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1?page=1&category=sliding-window&sortBy=submissions
class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < k; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        int j = 0;
        for (int i = k; i < n; i++) {
            ans.add(map.size());

            if (map.get(A[i - k]) > 1) {
                map.put(A[i - k], map.get(A[i - k]) - 1);
            } else {
                map.remove(A[i - k]);
            }

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        
        ans.add(map.size());
        return ans;
    }
}
