//https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1
class Solution {
    int lps(String s) {
       
        int n=s.length();
        int[] lps= new int[n];
        lps[0]=0;
        
        int i=1,prevlps=0;
        
        while(i<n) {
            
            if(s.charAt(i)==s.charAt(prevlps)) {
                prevlps++;
                lps[i]=prevlps;
                i++;
            }else {
                
                if(prevlps==0) {
                    lps[i]=0;
                    i++;
                }
                else {
                    prevlps=lps[prevlps-1];
                }
            }
        }
        return lps[n-1];
    }
}
