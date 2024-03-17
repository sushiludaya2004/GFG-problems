//https://www.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1?page=1&category=sliding-window&sortBy=submissions
class Solution {
    static int countOfSubstrings(String S, int k) {
        // code here
        int n = S.length();
        int cnt = 0;
        int dis = 0;
        int[] f = new int[26];
        for(int i = 0; i<k; i++){
            f[S.charAt(i) - 'a']++;
            if(f[S.charAt(i) - 'a'] == 1) dis++;
        }
        if(dis == k-1) cnt++;
        int left = 0;
        int right = k;
        while(right < n){
            f[S.charAt(left) - 'a']--;
            if(f[S.charAt(left) - 'a'] == 0) dis--;
            
            f[S.charAt(right) - 'a']++;
            if(f[S.charAt(right) - 'a'] == 1) dis++;
            if(dis == k-1) cnt++;
            left++;
            right++;
        }
        return cnt;
    }
};
