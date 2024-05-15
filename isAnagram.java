//https://www.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
         char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(b1);
        
        a=Arrays.toString(a1);
        b=Arrays.toString(b1);
        
        if(a.equals(b))
        {
            return true;
        }
        return false;
        
    }
}
