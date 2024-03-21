//https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1?page=1&category=sliding-window&sortBy=submissions
class Solution{
    int longestUniqueSubsttr(String S){
        // if(str.length()==0)
        //      return 0;
        // int maxans = Integer.MIN_VALUE;
        // for (int i = 0; i < str.length(); i++)
        // {
        //     Set < Character > se = new HashSet < > ();
        //     for (int j = i; j < str.length(); j++) 
            
        //     {
        //         if (se.contains(str.charAt(j)))  
               
        //         {
        //             maxans = Math.max(maxans, j - i);
        //             break;
        //         }
        //         se.add(str.charAt(j));
        //     }
        // }
        // return maxans;
        
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right=0;
        int max = 0;
        while(right < S.length())
        {
            if(!set.contains(S.charAt(right)))
            {
                set.add(S.charAt(right));
                right++;
            }
            else
            {
                set.remove(S.charAt(left));
                left++;
            }
            max = Math.max(max,set.size());
        }
     return max;   
    }
}
