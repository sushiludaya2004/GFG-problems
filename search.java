//https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1?page=1&category=sliding-window&sortBy=submissions
class Solution {

    int search(String pat, String txt) {
        // code here
        int size = pat.length();
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        int ans = 0;
        for(int i = 0; i <= size-1;i++){
            char c1 = txt.charAt(i);
            char c2 = pat.charAt(i);
            m1.put(c1,m1.getOrDefault(c1,0)+1);
            m2.put(c2,m2.getOrDefault(c2,0)+1);
        }
        if(m1.equals(m2)){
            ans++;
        }
        for(int j = size,t = 0; j <= txt.length() -1;j++,t++){
            char c1 = txt.charAt(j);
            char c2 = txt.charAt(t);
            if(m1.get(c2) > 1){
                m1.put(c2,m1.getOrDefault(c2,0)-1);
            }else{
                m1.remove(c2);
            }
             m1.put(c1,m1.getOrDefault(c1,0)+1);
             if(m1.equals(m2)){
               ans++;
             }
        }
        
        return ans;
        
    }
}
