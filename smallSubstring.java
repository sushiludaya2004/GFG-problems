//https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1?page=2&category=sliding-window&sortBy=submissions
class Solution {
    public int smallestSubstring(String S) {
        int one = 0;
        int two = 0;
        int zero = 0;
        int l = 0;
        int r = 0;
        int ans = -1;
        for(r = 0; r < S.length(); r++){
            if(S.charAt(r) == '0') zero++;
            else if(S.charAt(r) == '1') one++;
            else two++;
            
            while(one >= 1 && two >= 1 && zero >= 1 ){
                if(ans == -1) ans = r - l + 1;
                else ans = Math.min(ans, r-l+1);
                
                if(S.charAt(l) == '0') zero--;
                else if(S.charAt(l) == '1') one--;
                else two--;
                
                l++;
            }
        }
        return ans;
    }
};
