//https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1?page=2&category=sliding-window&sortBy=submissions
class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int start=0;
        int len = S.length();
        int minmum = Integer.MAX_VALUE;
        int[] count = new int[3];
        int found=0;
        
        for(int end=0;end<len;end++){
            
            char currentChar = S.charAt(end);
            
            if(currentChar>='0' && currentChar<='2'){
                count[currentChar - '0']++;
                if(count[currentChar - '0']==1){
                    found++;
                }
            }
            while(found == 3){
             char startChar = S.charAt(start);
            
            if(startChar>='0' && startChar<='2'){
                count[startChar - '0']--;
                if(count[startChar - '0']==0){
                    found--;
                    minmum = Math.min(minmum, end - start + 1);
                }
                
            }
            start++;
            }
            
        }
        return (minmum == Integer.MAX_VALUE) ? -1 : minmum;
    }
};
