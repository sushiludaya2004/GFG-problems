//https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution {
    int isPalindrome(String S) {
         
        int i = 0;
        int j = S.length() - 1;

        while (i < j) {

            if (S.charAt(i) != S.charAt(j))
                return 0;

         
            i++;
            j--;
        }

        return 1;
    }
};
