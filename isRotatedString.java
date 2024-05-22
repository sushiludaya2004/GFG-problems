//https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1?page=1&category=Strings&difficulty=Easy&sortBy=submissions
class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() <=1 && str2.length()<=1){
            return false;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        
        String temp=str1.substring(2)+str1.substring(0,2);
        String temp1=str2.substring(2)+str2.substring(0,2);
        if(str2.equals(temp) || str1.equals(temp1)){
            return true;
        }
        return false;
    }

    
}
