//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String s=" ";
       String[]words=S.trim().split("\\.");
       
       for(int i=words.length-1;i>=0;i--){
           s+=words[i];
           if(i!=0){
               s+=".";
           }
       }
       
       return s.toString().trim();
    }
}
